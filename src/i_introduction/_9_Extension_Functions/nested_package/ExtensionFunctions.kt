package i_introduction._9_Extension_Functions.nested_package

import i_introduction._9_Extension_Functions.RationalNumber
import i_introduction._9_Extension_Functions.todoTask9

/**
 * Created by ian on 14/05/17.
 */
fun Int.r(): RationalNumber  {
    return RationalNumber(this, 1)
}
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)
