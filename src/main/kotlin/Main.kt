import ejercicio2.GestorBBDD

fun main(args: Array<String>) {

    val gestor = GestorBBDD()

    println("Bienvenido, introduzca su email")
    var email: String = readln()

    if (gestor.searchUsuarioByEmailSesion(email) != null){
        //Existe una sesión activa
        println("Bienvenid@")
        gestor.close()
        //FIN
    }
    else{

        //No existe una sesión activa

        //Datos de login
        println("Introduzca un email: ")
        var email = readln()
        println("Introduzca una contraseña: ")
        var contraseña = readln()

        val clienteCompare = gestor.searchUsuarioByEmail(email)

        //Si el usuario no es null y coinciden las credenciales entonces se logea
        if (clienteCompare != null && clienteCompare.email == email && clienteCompare.password == contraseña) {
            //Doy de Alta
            gestor.darDeAltaSesion(clienteCompare)
            println("Bienvenido")
            gestor.close()
            //FIN
        }
        else
        {
            //Por otro lado, si no existe...
            println("Login Denegado")
            gestor.close()
        }




    }


}