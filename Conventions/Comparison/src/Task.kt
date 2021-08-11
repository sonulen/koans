data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other: MyDate): Int =
        compareValuesBy(this, other, { it.year }, { it.month }, { it.dayOfMonth })

}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
