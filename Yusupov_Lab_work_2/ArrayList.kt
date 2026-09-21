fun main() {

    // 1. Создать список и добавить 10 элементов
    val list = mutableListOf(12, 45, 7, 23, 89, 34, 56, 91, 2, 67)
    println("1. Список: $list")


    // 2. Удаление элемента по индексу
    list.removeAt(3)
    println("2. После удаления по индексу 3: $list")


    // 3. Найти среднее значение
    val average = list.average()
    println("3. Среднее: $average")


    // 4. Проверить является ли список пустым
    println("4. Пустой? ${list.isEmpty()}")


    // 5. Замена элемента по индексу
    list[1] = 2006
    println("5. После замены: $list")


    // 6. Перевести список строк в верхний регистр
    // создание списка строк
    val strList = listOf("android", "kotlin", "mobile")

    // перевод в верхний регистр
    val upperList = strList.map { it.uppercase() }
    println("6. Верхний регистр: $upperList")


    // 7. Удалить все чётные числа из списка
    list.removeAll { it % 2 == 0 }
    println("7. Без четных чисел: $list")


    // 8. Объединить два списка
    val listA = listOf(1, 2, 3)
    val listB = listOf(4, 5, 6)
    val mergedList = listA + listB
    println("8. Объединенный список: $mergedList")


    // 9. Вторые по величине элементы
    val sortedUnique = list.distinct().sortedDescending()
    val secondLargest = if (sortedUnique.size > 1) sortedUnique[1] else null
    println("9. Второй по величине: $secondLargest")


    // 10. Преобразовать список в Set
    val numberSet = list.toSet()
    println("10. Множество из списка: $numberSet")
}