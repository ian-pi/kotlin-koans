package i_introduction._2_Named_Arguments;

import java.util.Collection;
import java.util.stream.Collectors;

public class NamedArguments {

    private static String joinToString(Collection collection, String prefix, String suffix) {
        return (String) collection.stream().map(Object::toString).collect(Collectors.joining(", ", prefix, suffix));
    }

    public static String task2(Collection<Integer> collection) {
      return joinToString(collection, "{", "}");
    }

}
