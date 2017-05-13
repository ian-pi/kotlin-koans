package i_introduction._1_Java_To_Kotlin_Converter;

import util.JavaCode;

import java.util.Collection;
import java.util.Iterator;

public class JavaCode1 extends JavaCode {
    public String task1(Collection<Integer> integers) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Integer integer : integers ) {
            sb.append(integer);
            sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}