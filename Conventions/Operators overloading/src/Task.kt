import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval {
    DAY, WEEK, YEAR;

    operator fun times(number: Int):RepeatedTimeInterval{
        return RepeatedTimeInterval(number, this)
    }
}
class RepeatedTimeInterval(val number: Int,
                           val timeInterval: TimeInterval)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate{
    return this.addTimeIntervals(timeInterval, 1)
}
operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval): MyDate{
    return this.addTimeIntervals(repeatedTimeInterval.timeInterval,
                                repeatedTimeInterval.number)
}


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
   return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
