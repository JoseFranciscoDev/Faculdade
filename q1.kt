fun main(args: Array<String>) {
    val nomeProduto: String = "Monitor Gamer";
    val codigoProduto: Int = 546464;
    var quantidadeEstoque: Int = 4;
    var precoUnitario: Float = 465.5f;

    quantidadeEstoque -= 2;

    precoUnitario *= 1.1f;
    println(
        """
            |Nome do produto: $nomeProduto,
            |codigo do produto: $codigoProduto
            |quantidade no estoque: $quantidadeEstoque
            |preço unitário: $precoUnitario
            | """.trimMargin()
    )
}