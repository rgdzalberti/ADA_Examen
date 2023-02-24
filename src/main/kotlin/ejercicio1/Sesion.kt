package ejercicio1

import jakarta.persistence.*

@Entity
@Table(name="sesiones")
class Sesion(

    @Id
    @Column(name="sesionid")
    var sesionId: String,

    @Id
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name="email")
    val usuario: Usuario? = null



)

