fun main() {
    val totalCompra: Double = readln().toDouble()
    val porcentagemDesconto: Double
    if (totalCompra >= 200.00){
        println("Desconto\n" +
                "especial aplicado!")
        porcentagemDesconto = 0.15
    }
    else{
        porcentagemDesconto = 0.05
    }
    print(totalCompra - totalCompra * porcentagemDesconto)
}