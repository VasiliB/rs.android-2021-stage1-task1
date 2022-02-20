package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String?> {
        var c = 0
        var i = 0
        var m = 0
        var l = 0
        var closingBracket: Char? = null
        //Создать итговый массив
        var result: Array<String?> = arrayOfNulls(inputString.length)
        //Преобразовать в массив символов
        val media = inputString.toCharArray()
        //Создать строку для записи элемента в новый массив
        var buffer = ""
        val inatialArray = inputString.toCharArray()
        //Создать массив для перевода в строку
        lateinit var inprogress: Array<Char>
        //Поиск скобок

        while (i < inputString.length) {
            if (inputString[i] == '<' || inputString[i] == '[' || inputString[i] == '(') {
                when (inputString[i]) {
                    '<' -> closingBracket = '>'
                    '[' -> closingBracket = ']'
                    '(' -> closingBracket = ')'
                }
                while (inputString[i] != closingBracket) {
//                    var b = inputString[i]
                    buffer = buffer.padEnd(c, inputString[i])
                    c++
                    i++
                }
                if (inputString[i] == closingBracket) {
                    result[m] = buffer
                    m++
                    l++
                }
            }
        }

        //Если элемент <, ( или [ искать до следующего такого же, затем передать элемент массиву
        //Начать поиск с последнего найденного индекса
        //Если нет закрывающей скобки, продолжить поиск без записи
        println(buffer)
        m -= 1
        println(m)

        val finalResult = arrayOfNulls<String>(m + 1)
        for (y in 0..m) {
            finalResult[y] = result[y]
        }
        finalResult.forEach(System.out::print)
        return finalResult
    }
}

private operator fun String.set(c: Int, value: Char) {

}