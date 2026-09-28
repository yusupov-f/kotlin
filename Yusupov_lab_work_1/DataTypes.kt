fun main() {
    println("=== 2. DATA TYPES ===")

    // 1. Создать переменные разных типов: Int, Double, Boolean, String, Char.
    val myInt: Int = 42
    val myDouble: Double = 3.14
    val myBool: Boolean = true
    val myString: String = "Hello Kotlin"
    val myChar: Char = 'K'

    // 2. Преобразовать Double в Int и вывести результат.
    val dVal: Double = 9.99
    val dToInt: Int = dVal.toInt()
    println("Double $dVal в Int: $dToInt")

    // 3. Создать переменную num = 1234, преобразовать в строку.
    val num1 = 1234
    val numStr = num1.toString()
    println("Число в строку: $numStr")

    // 4. Взять строку "56", преобразовать в Int и умножить на 2.
    val strNum = "56"
    val resultStrNum = strNum.toInt() * 2
    println("Строка '56' * 2: $resultStrNum")

    // 5. Проверить, что число 10 больше 5, вывести результат в Boolean.
    val isGreater: Boolean = 10 > 5
    println("10 > 5: $isGreater")

    // 6. Создать переменную isEven, которая хранит результат проверки чётности числа.
    val checkNum = 8
    val isEven: Boolean = checkNum % 2 == 0
    println("Число $checkNum чётное: $isEven")

    // 7. Преобразовать Boolean в строку.
    val boolVal = true
    val boolStr: String = boolVal.toString()
    println("Boolean в строку: $boolStr")

    // 8. Вывести минимальное и максимальное значение для типа Int.
    println("Int MIN: ${Int.MIN_VALUE}, MAX: ${Int.MAX_VALUE}")

    // 9. Создать переменную ch = 'b', преобразовать её в Int.
    val ch: Char = 'b'
    val chCode: Int = ch.code
    println("ASCII код символа '$ch': $chCode")

    // 10. Создать переменную num = 97, преобразовать в символ.
    val num2 = 97
    val codeToChar: Char = num2.toChar()
    println("Символ с кодом $num2: $codeToChar")
} 