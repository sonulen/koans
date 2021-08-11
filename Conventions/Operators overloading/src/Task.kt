import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

class TimeIntervalWithAmount (val interval: TimeInterval, val amount: Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(time: TimeIntervalWithAmount): MyDate = addTimeIntervals(time.interval, time.amount)

private operator fun TimeInterval.times(i: Int) = TimeIntervalWithAmount(this, i)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

