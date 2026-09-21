fun main() {
    // 1. Создать Map (ID -> имя)
    val students = mutableMapOf(1 to "Azim", 2 to "Mikita", 3 to "Erkin", 4 to "Erbol")
    println("1. Исходная Map: $students")


    // 2. Добавить новый элемент
    students[5] = "Farhad"
    println("2. После добавления ID 5: $students")


    // 3. Получить значение по ключу
    val studentName = students[2]
    println("3. Студент с ID 2: $studentName")


    // 4. Проверить есть ли ключ
    println("4. Есть ключ 3? ${students.containsKey(3)}")


    // 5. Проверить есть ли значение
    println("5. Есть значение 'Mikita'? ${students.containsValue("Mikita")}")


    // 6. Вывести все ключи и значения отдельно
    println("6. Ключи: ${students.keys}")
    println("   Значения: ${students.values}")


    // 7. Удалить элемент по ключу
    students.remove(5)
    println("7. После удаления ID 5: $students")


    // 8. Посчитать количество элементов
    println("8. Размер Map: ${students.size}")


    // 9. Цикл по словарю
    println("9. Обход словаря:")
    for ((id, name) in students) {
        println("   ID: $id, Имя: $name")
    }


    // 10. Map с оценками и поиск среднего балла
    val grades = mapOf("Pubg" to 70, "far-far-west" to 90, "jump-space" to 60, "dota-2" to 30)
    val averageGrade = grades.values.average()
    println("10. Оценки: $grades")
    println("    Средняя оценка: $averageGrade")
}