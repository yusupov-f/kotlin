fun main() {
    println("=== 1. VARIABLES ===")

    // 1. Объявить переменную x типа Int и присвоить значение 10.
    var x: Int = 10

    // 2. Создать константу pi типа Double со значением 3.14159.
    val pi: Double = 3.14159

    // 3. Объявить переменную isActive типа Boolean и задать false.
    var isActive: Boolean = false

    // 4. Создать переменную temperature типа Float, присвоить 36.6.
    var temperature: Float = 36.6f

    // 5. Объявить переменную count типа Long и присвоить большое число.
    var count: Long = 10_000_000_000L

    // 6. Объявить переменную letter типа Char и присвоить 'A'.
    var letter: Char = 'A'

    // 7. Создать две переменные a, b типа Int, сложить их и вывести результат.
    val a: Int = 15
    val b: Int = 25
    println("Сумма a и b: ${a + b}")

    // 8. Создать переменную radius и вычислить площадь круга.
    val radius: Double = 5.0
    val area = pi * radius * radius
    println("Площадь круга: $area")

    // 9. Создать переменную salary типа Int, увеличить ее на 15% и вывести.
    var salary: Int = 100000
    val newSalary = salary * 1.15
    println("Зарплата после увеличения на 15%: $newSalary")

    // 10. Создать переменную price и вычислить цену с налогом (НДС 12%).
    val price: Double = 500.0
    val priceWithTax = price * 1.12
    println("Цена с НДС (12%): $priceWithTax")
}   