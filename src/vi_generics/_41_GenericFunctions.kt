package vi_generics

import util.TODO
import java.util.*

fun task41(): Nothing = TODO(
    """
        Task41.
        Add a 'partitionTo' function that splits a collection into two collections according to a predicate.
        Uncomment the commented invocations of 'partitionTo' below and make them compile.

        There is a 'partition()' function in the standard library that always returns two newly created lists.
        You should write a function that splits the collection into two collections given as arguments.
        The signature of the 'toCollection()' function from the standard library may help you.
    """,
        references = { l: List<Int> ->
            l.partition { it > 0 }
            l.toCollection(HashSet<Int>())
        }
)

fun <T, A : MutableCollection<T>, B : MutableCollection<T>> Collection<T>.partitionTo(destination1 : A, destination2: B,  predicate : (T) -> Boolean ): Pair<A, B> {
    val (part1, part2) = partition(predicate)
    return Pair<A, B>(part1.toCollection(destination1), part2.toCollection(destination2))
}

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
//    task41()
    return partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
//    task41()
    return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
}