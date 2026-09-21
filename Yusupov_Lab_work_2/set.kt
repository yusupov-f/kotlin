fun main() {
    // 1. Создать множество чисел
    val setA = mutableSetOf(2, 4, 7, 8, 15)
    println("1. Множество A: $setA")

    
    // 2. Добавить похожие элементы
    setA.add(8)
    setA.add(17)
    println("2. После добавления 8 и 17: $setA")

    val setB = setOf(4, 6, 7, 9, 12)


    // 3. Пересечение (элементы которые есть в обоих множествах)
    val intersectSet = setA.intersect(setB)
    println("3. Пересечение: $intersectSet")


    // 4. Объединение (все элементы из двух множеств без дубликатов)
    val unionSet = setA.union(setB)
    println("4. Объединение: $unionSet")


    // 5. Разность (выделить элементы из A которых нет в B)
    val subtractSet = setA.subtract(setB)
    println("5. Разность A - B: $subtractSet")


    // 6. Проверка на наличие элемента в множестве
    println("6. Содержит 7: ${7 in setA}")


    // 7. Количество уникальных символов в строке
    val str = "прокрастинация"
    val uniqueCharsCount = str.toSet().size
    println("7. Уникальных символов в '$str': $uniqueCharsCount")


    // 8. Удаление дубликатов из списка
    val duplicatedList = listOf(2, 4, 1, 2, 7, 0, 1)
    val cleanSet = duplicatedList.toSet()
    println("8. Без дубликатов: $cleanSet")


    // 9. Симметрическая разность (элементы находящиеся только в 1 сете но не в обоих)
    val symDiff = (setA - setB) + (setB - setA)
    println("9. Симметрическая разность: $symDiff")


    // 10. Множество строк и поиск "Kotlin"
    val languages = setOf("Java", "Kotlin", "Swift", "Python")
    println("10. Есть слово 'Kotlin'? ${"Kotlin" in languages}")
}