package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

operator fun MyDate.compareTo(that: MyDate): Int {
    if (this.year != that.year) return this.year.compareTo(that.year)
    if (this.month != that.month) return this.month.compareTo(that.month)
    return this.dayOfMonth.compareTo(that.dayOfMonth)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {

    var date : MyDate = start;

    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            override fun hasNext(): Boolean {
                return date <= endInclusive;
            }

            override fun next(): MyDate {
                val returnDate = date;
                date = date.nextDay()
                return returnDate
            }

        }
    }


    operator fun contains(d : MyDate) : Boolean {
        return d >= start && d <= endInclusive
    }
}





