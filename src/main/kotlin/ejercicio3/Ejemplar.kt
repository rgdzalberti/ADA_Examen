package ejercicio3

import jakarta.persistence.*

@Entity
@Table(name="ejemplar")
class Ejemplar(

    @Id
    @Column(name = "codigo")
    var codigo:Int,
    @Column(name = "localizacion")
    var localizacion: String,

    @ManyToOne
    @JoinColumn(name = "codigo_del_libro")
    var libro:Libro? = null,

    @OneToMany(mappedBy = "ejemplar")
    var usuarioEjemplar: Set<UsuarioEjemplar>? = null,

    )