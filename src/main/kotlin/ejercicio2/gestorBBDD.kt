package ejercicio2

import ejercicio1.Usuario
import jakarta.persistence.NoResultException
import jakarta.persistence.Persistence
import java.util.*
import kotlin.random.Random.Default.nextInt

class GestorBBDD{

    private val entityManagerFactory = Persistence.createEntityManagerFactory("bdpruebaExamen")
    private val entityManager = entityManagerFactory.createEntityManager()
    private val transaction = entityManager.transaction

    fun searchUsuarioByEmail(email:String):ejercicio1.Usuario?{
        val query = entityManager.createQuery("from ejercicio1.Usuario where email = :email", ejercicio1.Usuario::class.java)
        return try {
            query.singleResult
        } catch (e: NoResultException) {
            null
        }
    }

    fun searchUsuarioByEmailSesion(email:String):ejercicio1.Sesion?{
        val query = entityManager.createQuery("from ejercicio1.Sesion where email = :email", ejercicio1.Sesion::class.java)
        return try {
            query.singleResult
        } catch (e: NoResultException) {
            null
        }
    }

    fun darDeAltaSesion(user: Usuario){
        entityManager.transaction.begin()
        var idGenerado = (0..30).random().toString()
        val query = entityManager.createQuery("INSERT INTO ejercicio1.Sesion ( idGenerado,user)", ejercicio1.Sesion::class.java)
        query.executeUpdate()
        transaction.commit()
    }

    fun close() {
        entityManagerFactory.close()
        entityManager.close()
    }


}