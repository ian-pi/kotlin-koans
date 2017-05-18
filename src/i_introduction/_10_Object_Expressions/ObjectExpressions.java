package i_introduction._10_Object_Expressions;

import java.util.*;

import static com.google.common.collect.Lists.newArrayList;

class ObjectExpressions {
    public List<Integer> task10() {
        List arrayList = newArrayList(1, 5, 2);
        Collections.sort(arrayList, new Comparator<Integer>() {

            public int compare(Integer o, Integer t1) {
                return  o.compareTo(t1);
            }
        });
        return arrayList;
    }
}
