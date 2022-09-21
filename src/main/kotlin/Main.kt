import java.util.*

fun main() {
    val str = readLine()!!
    print(str.filter { it == 'A' }.count().toString() + " ")
    print(str.filter { it == 'T' }.count().toString() + " ")
    print(str.filter { it == 'G' }.count().toString() + " ")
    print(str.filter { it == 'C' }.count().toString())

    // A (аденин), T (тимин), G (гуанин), C (цитозин).
   /* var a = 0
    var t = 0
    var g = 0
    var c = 0
    val str = readLine()
    if(str != null) {
        for(i in str) {
            if(i == 'A') {
                a++
            }
            if(i == 'T') {
                t++
            }
            if(i == 'G') {
                g++
            }
            if(i == 'C') {
                c++
            }
        }
    }
    println("$a $t $g $c")
*/





  //  test4()
    //println(countVowels("sdfsdfsdf"))
   // countVowels("tzxncmppqh123")
}
fun task1() {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = Math.sqrt((a*a)+(b*b).toDouble())
    println(c)
}

fun task2() {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val n = scan.nextInt()
    val c = (a * 100 + b) * n
    println((c/100).toString() + " " + (c%100).toString())
}

fun test3() {
    val scan = Scanner(System.`in`)
    val x1 = scan.nextInt()
    val y1 = scan.nextInt()
    val x2 = scan.nextInt()
    val y2 = scan.nextInt()
    if(x1 == x2 || y1 == y2) {
        println("YES")
    } else {
        println("NO")
    }
}
fun test4() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    var s = 0
    for(i in 1..n) {
        s += i * i
    }
    println(s)
}
fun countVowels(str: String): Int {
    var counter: Int = 0
    for(i in 0 until str.length) {
        val letter = str[i]
        //  (a, e, i, o, u)
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            counter++
        }
    }
    return counter
}
fun countVowels2(str: String): Int {
    var c = 0
    for(i in str) {
        when(i) {
            'a','e','i','o','u' -> c += 1
        }
    }
    return c
}
fun countVowels3(str: String): Int {
    val vowels = arrayOf('a','e','i','o','u')
    return str.lowercase(Locale.getDefault()).filter{ vowels.contains(it) }.count()
    // deprecated & legacy  !!!
}
