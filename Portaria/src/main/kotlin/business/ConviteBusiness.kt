package business


class ConviteBusiness {
    fun tipoValido(tipoConvite: String) : Boolean {
         if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            return true
         }
        return false
    }

    fun codigoValido(codigoConvite: String): Boolean {
        if (codigoConvite.startsWith("xt") || codigoConvite.startsWith("xl")) {
            return true
        }
        return false
    }

    fun conviteValido(tipoConvite: String, codigoConvite: String): Boolean {
        tipoConvite.lowercase()
        codigoConvite.lowercase()
        if(tipoConvite == "comum" && codigoConvite == "xt")
            return true
        else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigoConvite == "xl")
            return true
        return false
    }
}