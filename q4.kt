fun main() {
    val mediaFinal = 8.5
    val frequencia = 80
    val participouProjetoSocial = true
    val aprovado = mediaFinal > 7.0 && frequencia >= 75
    val ganhaBolsa = aprovado && mediaFinal >= 9.0 || participouProjetoSocial == true
    val precisaRecuperacao = !aprovado
    println(
        """
        $aprovado
        $ganhaBolsa
        $precisaRecuperacao
    """.trimIndent()
    )
}