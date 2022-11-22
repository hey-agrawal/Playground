fun main() {
    val arr = arrayOf("B", "D", "A", "C", "B", "A")
    val frequencyMap: MutableMap<String, Int> = HashMap()

    for (s in arr)
    {
        var count = frequencyMap[s]
        if (count == null) count = 0
        frequencyMap[s] = count + 1
    }

    println(frequencyMap)
}
