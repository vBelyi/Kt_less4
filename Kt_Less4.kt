fun main() {
    println("Вивести всі парні числа від 1 до 100")
    taskA()
    println("Вивести на екран факторіал числа 7")
    taskB()
    println("Вивести на екран числа Фібоначчі до 100")
    taskC()
    println("Вивести на екран числа Фібоначчі до 100 - другий спосіб")
    taskC2()
    println("Вивести всі парні числа від 1 до 100 з використанням рекурсії.")
    recursA2(0)
    println("Вивести на екран факторіал числа 7 з використанням рекурсії")
    val resultB2 = recursB2(7)
    println(resultB2)
    println("Вивести на екран числа Фібоначчі до 100 з використанням рекурсії")
    for (i in 0..100) {
        val recursFib = recursC2(i)
        if (recursFib <= 100) {
            println(recursFib)
        } else {
            break
        }
    }
}

//=====================Task 1.a - виводить всі парні числа від 1 до 100
fun taskA() {
    for (i in 0..100 step 2) {
        println(i)
    }
}

//=====================Task 1.b - виводить на екран факторіал числа 7
fun taskB() {
    var b = 7
    for (i in 1..b-1) {
        b = i * b
    }
    println(b)
}

//=====================Task 1.с - виводить на екран числа Фібоначчі до 100
fun taskC() {
    var a = 0
    var b = 1
    while (a < 100) {
        println(a)
        val temp = a + b
        a = b
        b = temp
    }
}
//Це я зробив другий варіант по Фібоначчі, без рекурсії. Знаю трохи не логічний, але все ж таки виводить ряд, з застосуванням меньшої кількості циклів.
fun taskC2() {
    var a = 0
    var b = 1
    while (a < 100) {
        println(a)
        println(b)
        a += b
        b += a
    }
}

//====================Task 2.a -з рекурсією виводить всі парні числа від 1 до 100
fun recursA2 (n:Int) {
    if (n <=100) {
        println(n)
        recursA2(n+2)
    }
}

//===================Task 2.b - з рекурсією виводить на екран факторіал числа 7
fun recursB2(n: Int): Int {
    if (n <= 1) {
        return 1
    } else {
        return recursB2(n-1) * n
    }
}

//==================Task 2.c - з використанням рекурсії вивести на екран числа Фібоначчі до 100
fun recursC2(n: Int ):Int {
    if (n <= 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else {
        return recursC2(n-1) + recursC2(n-2)
    }
}