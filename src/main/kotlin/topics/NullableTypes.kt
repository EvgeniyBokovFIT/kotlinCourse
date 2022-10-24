package topics

fun main() {
    var a: String = "Hello"
    // a = null - error

    println(a.length)

    var b: String? = "Test"
    b = null

    // length of b if not null, else -> null
    b?.length

    // bob?.department?.head?.name -> null

    // Elvis operator - ?:
    val l = b?.length ?: -1

    b = if((0..10).random() > 5) "qwert" else null
    // !! - throws NPE if null
    val t = b!!.length





}