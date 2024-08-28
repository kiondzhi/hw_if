fun main() {
     //1
    val num = 10;
    if (num > 0) {
        println(num + 1)
    }   else {
        println(num)
    }
    //2
    val numbers = arrayOf(4, 45, -2, 8)
    var result = 0
    for (number in numbers) {
        if (number > 0) {
            result++;
        }
    }
    println(result)
    //3
    val a = 10
    val b = 20
    if (a > b) println(a) else println(b)
    //4
    val numOfWeek = 5
    if (numOfWeek == 1) {
        println("Понедельник")
    }   else if (numOfWeek == 2) {
        println("Вторник")
    }   else if (numOfWeek == 3) {
        println("Среда")
    }   else if (numOfWeek == 4) {
        println("Четверг")
    } else if (numOfWeek == 5) {
        println("Пятница")
    }   else if (numOfWeek == 6) {
        println("Суббота")
    }   else if (numOfWeek == 7) {
        println("Воскресенье")
    }   else {
        println("Вы ввели неверное число :)")
    }
    //5
    val K = 4
    if (K == 1) {
        println("плохо")
    }   else if (K == 2) {
        println("неудовлетворительно")
    }   else if (K == 3) {
        println("удовлетворительно")
    }   else if (K == 4) {
        println("хорошо")
    }   else if (K == 5) {
        println("отлично")
    }   else {
        println("ошибка")
    }
    //6
    val firstNum = 10.0
    val secondNum = 2.7
    val numOfAction = 4
    if (numOfAction == 1) {
        println(firstNum + secondNum)
    }   else if (numOfAction == 2) {
        println(firstNum - secondNum)
    }   else if (numOfAction == 3) {
        println(firstNum * secondNum)
    }   else if (numOfAction == 4) {
        println(firstNum / secondNum)
    }   else {
        println("Нет такого действия")
    }
}