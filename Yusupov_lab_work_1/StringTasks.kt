fun main() {
    println("=== 3. STRING ===")

    // 1. Создать строку "Kotlin" и вывести её длину.
    val strKotlin = "Kotlin"
    println("Длина строки '$strKotlin': ${strKotlin.length}")

    // 2. Вывести первый и последний символ строки "Hello".
    val strHello = "Hello"
    println("Первый: ${strHello.first()}, Последний: ${strHello.last()}")

    // 3. Объединить строки "Good" и "Morning" в одну.
    val combined = "Good" + " " + "Morning"
    println("Объединенная строка: $combined")

    // 4. Создать строку "banana", заменить "a" на "o".
    val banana = "banana"
    println("Замена 'a' на 'o': ${banana.replace('a', 'o')}")

    // 5. Сконкатенировать имя и возраст в одну строку с шаблоном.
    val name = "Фархад"
    val age = 19
    println("Привет, меня зовут $name, мне $age лет.")

    // 6. Дана строка "Welcome". Вывести подстроку с 1 по 3 символ (индексы 0..2).
    val welcome = "Welcome"
    println("Подстрока (1-3 символы): ${welcome.substring(0, 3)}")

    // 7. Создать строку " Kotlin ", удалить пробелы по краям.
    val spacedStr = " Kotlin "
    println("Без пробелов: '${spacedStr.trim()}'")

    // 8. Проверить, содержится ли слово "Java" в строке "I love Java and Kotlin".
    val sentence = "I love Java and Kotlin"
    println("Содержит 'Java': ${sentence.contains("Java")}")

    // 9. Создать строку "Hello, World!", преобразовать все буквы в верхний регистр.
    val hw = "Hello, World!"
    println("Верхний регистр: ${hw.uppercase()}")

    // 10. Создать строку "HELLO", преобразовать в нижний регистр.
    val upper = "HELLO"
    println("Нижний регистр: ${upper.lowercase()}")

    // 11. Создать строку "Kotlin is fun", подсчитать количество слов.
    val sentenceFun = "Kotlin is fun"
    val wordCount = sentenceFun.split(" ").size
    println("Количество слов: $wordCount")

    // 12. Создать строку "abc", повторить её 3 раза (abcabcabc).
    val abc = "abc"
    println("Повтор 3 раза: ${abc.repeat(3)}")

    // 13. Создать строку "123", преобразовать в список символов.
    val numSequence = "123"
    val charList = numSequence.toList()
    println("Список символов: $charList")

    // 14. Из строки "racecar" проверить, является ли она палиндромом.
    val palindrome = "racecar"
    val isPalindrome = palindrome == palindrome.reversed()
    println("'$palindrome' палиндром: $isPalindrome")

    // 15. Из строки "apple,banana,orange" сделать список слов.
    val fruits = "apple,banana,orange"
    val fruitList = fruits.split(",")
    println("Список фруктов: $fruitList")
}