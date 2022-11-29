package control

import Console
import business.ConviteBusiness

class Portaria {

    private var conviteBusiness = ConviteBusiness()

    init {
        println(controle())
    }



    private fun controle() : String {
        //criando o console
        val console = Console()

        //validacao da idade
        val idade = console.readInt("Qual sua idade? ")
        if ( idade < 18) {
            return "Negado. Menores de idade não são permitidos"
        }



        //tratamento do convite
        val tipoConvite = console.readString("Qual é o tipo de convite? ")
        if (!conviteBusiness.tipoValido(tipoConvite)) return "Tipo inválido!"

        val codigoConvite = console.readString("Qual o código do convite? ")
        if(!conviteBusiness.codigoValido(codigoConvite)) return "Código inválido!"

        /*
        if (tipoConvite != "") {
            tipoConvite = tipoConvite.lowercase()
            // Validação do tipo de convite

            if (tipoConvite != "comum" || tipoConvite != "premium" || tipoConvite != "luxo") {
                return "Negado. Tipo de Convite inválido."
            }
         */
         //validaçao do código do convite
         /*
            var codigo = console.readString("Qual o código do convite? ")
            if (codigo != "") {
                codigo = codigo.lowercase()
                if (((tipoConvite == "premium") || (tipoConvite == "luxo")) && codigo.startsWith("xl")) {
                    return "Welcome :)"
                }
                if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                    return "Welcome :)"
                }
            }
        }
        */

        //valida o convite
        if (conviteBusiness.conviteValido(tipoConvite,codigoConvite)) {
            return "Seja Bem vindo!"
        }else{
            return "Acesso Negado! Convite Inválido!"
        }

    }

}


// Função portaria usada para consulta
/*
fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Entity.Convite inválido.")
            return
        }
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Entity.Convite inválido")
            }
        }
    }
}
* */