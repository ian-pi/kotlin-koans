package i_introduction._9_Extension_Functions;

import kotlin.Pair;
import util.JavaCode;

public class JavaCode9 extends JavaCode {
    public void useExtension() {
        char c = ExtensionFunctionsKt.lastChar("abc");
    }

    public static RationalNumber r(Pair<Integer, Integer> pair) {
        return new RationalNumber(pair.getFirst(), pair.getSecond());
    }

    public static RationalNumber r(Integer integer) {
        return new RationalNumber(integer, 1);
    }
}
