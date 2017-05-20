package ii_collections;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class _20_GroupByJava {

    public static Map<City, List<Customer>> groupCustomersByCity(Shop shop) {
        return shop.getCustomers().stream().collect(groupingBy(Customer::getCity));
    }

}

//fun example7() {
//    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
//
//    result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
//}
//
//fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
//    // Return a map of the customers living in each city
////    todoCollectionTask()
//    return this.customers.groupBy { it.city }
//}
