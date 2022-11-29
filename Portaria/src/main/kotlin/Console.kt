class Console {

    fun readInt(msg : String) : Int {
        var retorno : Int? = null
        do {
            print(msg)
            val info = readLine() //lê uma infomaçãpo no console

            if (info != null && info != "") {
                retorno = info.toIntOrNull()
                if (retorno == null || retorno < 1 )
                    println("Valor inválido")
            } else {
                println("Valor inválido")
            }
        } while (retorno == null || retorno < 1)
        return retorno
    }


    fun readString(msg : String) : String{
        var retorno : String?
        do {
            print(msg)
            retorno = readLine() //lê uma infomaçãpo no console
            if (retorno == null || retorno == "" ){
                    println("Valor inválido")
            }
        }while (retorno == "")
        return retorno.toString()

    }
}