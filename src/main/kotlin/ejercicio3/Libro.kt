package ejercicio3

import jakarta.persistence.*


@Entity
@Table(name="libro")
class Libro(

    @Id
    @Column(name = "codigo")
    var codigo:Int,
    @Column(name = "titulo")
    var titulo: String,
    @Column(name = "isbn")
    var isbn: String,
    @Column(name = "editorial")
    var editorial: String,
    @Column(name = "paginas")
    var paginas: Int,

    @OneToMany(mappedBy = "libro")
    var ejemplares: Set<Ejemplar>? =  null,

    @ManyToMany(mappedBy = "libros")
    var autores: Set<Autor>? = null

    )