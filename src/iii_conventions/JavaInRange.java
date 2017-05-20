package iii_conventions;

import com.google.common.collect.Range;
import com.sun.xml.internal.ws.util.StreamUtils;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import static java.lang.System.out;
import static java.util.stream.IntStream.range;

/**
 * Created by ian on 20/05/17.
 */
public class JavaInRange {

    public static void printStuff() {

        range(1, 10).forEach(out::println);
    }

    public static class DateRange implements Collection{

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull @Flow(sourceIsContainer = true, targetIsContainer = true) Collection collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean retainAll(@NotNull Collection collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection collection) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection collection) {
            return false;
        }

        @NotNull
        @Override
        public Object[] toArray(@NotNull Object[] objects) {
            return new Object[0];
        }
    }

}
