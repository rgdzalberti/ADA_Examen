package ejercicio3

import ejercicio1.Usuario
import jakarta.persistence.*

@Entity
@Table(name = "usuarios_ejemplares")
class UsuarioEjemplar(

    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_usuario")
    var usuario: Usuario,



    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_ejemplar")
    var ejemplar: Ejemplar,


    @Column(name= "fecha_prestamo")
    var fechaPrestamo:String,

    @Column(name = "fecha_devuelto")
    var fechaDevuelto:String

    //

)