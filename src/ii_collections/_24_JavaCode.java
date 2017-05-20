package ii_collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import util.JavaCode;

import java.util.*;

import static java.lang.Integer.valueOf;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;

public class _24_JavaCode extends JavaCode {

    public Collection<String> doSomethingStrangeWithCollection(Collection<String> collection) {
        Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
        for (String s : collection) {
            List<String> strings = groupsByLength.get(s.length());
            if (strings == null) {
                strings = Lists.newArrayList();
                groupsByLength.put(s.length(), strings);
            }
            strings.add(s);
        }

        int maximumSizeOfGroup = 0;
        for (List<String> group : groupsByLength.values()) {
            if (group.size() > maximumSizeOfGroup) {
                maximumSizeOfGroup = group.size();
            }
        }

        for (List<String> group : groupsByLength.values()) {
            if (group.size() == maximumSizeOfGroup) {
                return group;
            }
        }
        return null;
    }

    public static Collection<String> mostCommonWordLength(Collection<String> collection) {
        Map<Integer, List<String>> groupsByLength = collection.stream().collect(groupingBy(String::length));
        Optional<List<String>> max = groupsByLength.values().stream().max(comparingInt((List e) -> e.size()));
        return max.orElse(null);
    }
}
