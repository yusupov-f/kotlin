fun main() {

    // создание массива чисел
    val numbers = arrayOf(5, 2, 8, 1, 4)


    // // 1. Вывод всех элементов
    println("1. Элементы: ${numbers.joinToString()}")

    // // 2. Сумма всех элементов
    val sum = numbers.sum()
    println("2. Сумма: $sum")


    // // 3. Найти самый большой элемент
    val max = numbers.maxOrNull()
    println("3. Максимум: $max")


    // // 4. Посчитать количество чётных чисел в массиве
    val evenCount = numbers.count { it % 2 == 0 }
    println("4. Четных: $evenCount")


    // 5. Развернуть массив
    val reversed = numbers.reversedArray()
    println("5. Обратный порядок: ${reversed.joinToString()}")


    // 6. Проверить содержится ли определённое число в массиве 
    val containsNumber = 8 in numbers
    println("6. Содержит 8: $containsNumber")


    // 7. сортировка массива по возрастанию
    val sorted = numbers.sortedArray()
    println("7. Отсортированный: ${sorted.joinToString()}")
    

    // 8. Массив строк и самая длинная строка  
    // создание массива строк
    val words = arrayOf("Mobile", "IoT", "Development", "Kotlin")

    // найти самое длинное слово
    val longestWord = words.maxByOrNull { it.length }
    println("8. Самое длинное слово: $longestWord")


    // 9. поиск индекса минимального элемента
    val minIndex = numbers.indices.minByOrNull { numbers[it] }
    println("9. Индекс минимума: $minIndex")


    // 10. Умножение каждого элемента на 2
    val doubled = numbers.map { it * 2 }
    println("10. Умножили на 2: $doubled")

}
