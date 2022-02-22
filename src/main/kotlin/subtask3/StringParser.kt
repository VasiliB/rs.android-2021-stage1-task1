package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String?> {
        var bufferIndex = 0
        var index = 0
        var resultIndex = 0
        var closingBracket: Char? = null
        //Создать итговый массив
        var result: Array<String?> = arrayOfNulls(inputString.length)
        //Преобразовать в массив символов
        //Создать строку для записи элемента в новый массив
        var buffer = ""
        //Создать массив для перевода в строку
        //Поиск скобок

        while (index < inputString.length) {
            if (inputString[index] == '<' || inputString[index] == '[' || inputString[index] == '(') {
                var openBracket = index
                when (inputString[index]) {
                    '<' -> closingBracket = '>'
                    '[' -> closingBracket = ']'
                    '(' -> closingBracket = ')'
                }
                while (inputString[index] != closingBracket) {
                    buffer = buffer.padEnd(bufferIndex, inputString[index])
                    bufferIndex++
                    index++
                }
                if (inputString[index] == closingBracket) {
                    result[resultIndex] = buffer
//                    println(buffer)
                    buffer = ""
                    bufferIndex = 0
//                    println(buffer)
                    resultIndex++
                    if (index != inputString.lastIndex) {
                        index = openBracket +1
                    }
                }
            }
            index++
        }
        //Если элемент <, ( или [ искать до следующего такого же, затем передать элемент массиву
        //Начать поиск с последнего найденного индекса
        //Если нет закрывающей скобки, продолжить поиск без записи
//        println(buffer)
        resultIndex -= 1
//        println(resultIndex)

        val finalResult = arrayOfNulls<String>(resultIndex + 1)
        for (y in 0..resultIndex) {
            finalResult[y] = result[y]
        }
        println(finalResult.contentToString())
        return finalResult
    }
}

