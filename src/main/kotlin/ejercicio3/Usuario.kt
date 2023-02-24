package ejercicio3

import jakarta.persistence.*

@Entity
@Table(name = "usuario")
class Usuario(


    @Id
    @Column(name = "codigo")
    var codigo:Int,
    @Column(name = "nombre")
    var nombre:String,
    @Column(name = "telefono")
    var telefono:String,
    @Column(name = "direccion")
    var direccion:String,

    @OneToMany(mappedBy = "usuario")
    var usuarioEjemplar: Set<UsuarioEjemplar>? = null
)