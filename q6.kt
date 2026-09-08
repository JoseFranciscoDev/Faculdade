fun main(){
    val diaDaSemana: Int;
    val tipoDoDia = when(diaDaSemana){
        1 || 7 -> "Fim de semana"
        2..6 -> "Dia útil"
        else -> "Dia invalido"
    }
    print("O dia selecionado é: $tipoDoDia")
}