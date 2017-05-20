package iii_conventions;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ian on 20/05/17.
 */
public class JavaCode {

    public static void printMap() {
        HashMap<String, Integer> map = new HashMap<>();

        for (Map.Entry entry : map.entrySet()) {
          out.println(format("key=%s value=%s", entry.getKey(), entry.getValue()));
        }


    }

}
