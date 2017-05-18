package i_introduction._9_Extension_Functions

import i_introduction._9_Extension_Functions.nested_package.r
import org.junit.Assert.assertEquals
import org.junit.Test

class _09_Extension_Functions() {
    @Test fun testIntExtension() {
        assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
        assertEquals("Rational number creation error: ", RationalNumber(4, 1), JavaCode9.r(4))
    }

    @Test fun testPairExtension() {
        assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
        assertEquals("Rational number creation error: ", RationalNumber(2, 3), JavaCode9.r(Pair(2, 3)))
    }
}