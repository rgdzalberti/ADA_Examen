package ejercicio3

import jakarta.persistence.*

@Entity
@Table(name="autor")
class Autor(

    @Id
    @Column(name = "codigo")
    var codigo:Int,
    @Column(name = "nombre")
    var nombre: String,


    @ManyToMany
    @JoinTable(
        name = "autor_del_libro",
        joinColumns = [JoinColumn(name = "codigo")],
        inverseJoinColumns = [JoinColumn(name = "codigo")]
    )
    var libros:Set<Libro>? = null,

    /*
    @ManyToMany(mappedBy = "autores")
    var libros: Set<Libro>? = null

     */

)