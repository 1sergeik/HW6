fun main(){
    var year: String = ""
    var a = 1
    while (a==1) {
        println("Введите год в формате \"yyyy\"")
        year = readln()
        if (year.length == 4 && year[0].isDigit() == true && year[1].isDigit() == true &&
            year[2].isDigit() == true && year[3].isDigit() == true) {
            a = 2
        } else {
            println("Вы ошиблись, будте пожалуйста внимательней")
        }
    }
    val yearN = year.toInt()
    print("Количество дней ")
    print(if ((yearN % 400 == 0 || yearN % 4 == 0 ) && yearN % 100 != 0) 366 else 365)
}