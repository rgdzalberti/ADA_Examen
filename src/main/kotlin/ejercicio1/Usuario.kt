package ejercicio1

import ejercicio3.UsuarioEjemplar
import jakarta.persistence.*

@Entity
@Table(name="usuarios")
class Usuario(

    @Id
    @Column(name = "email")
    var email:String,
    @Column(name = "id")
    var id:Int,
    @Column(name = "nombre")
    var nombre: String,
    @Column(name = "password")
    var password: String,
    @Column(name = "activo")
    var activo: Boolean,


    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "sesionId")
    var sesion: Sesion? = null,


)