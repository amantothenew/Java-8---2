// Q1)Implement following functional interfaces from java.util.function using lambdas: 1. Consumer 2. Supplier 3. Predicate 4. Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class FlatMap{
    public static void main(String[] args) {
        Consumer<Integer> compare = (x)-> {
            System.out.println("This is Compare Interface: "+x*2);
        };
        compare.accept(5);

        Function<String, Integer> function = (x) -> {
            return x.length();
        };
        System.out.println("This is Function interface: "+function.apply("Aman"););

        Predicate<Integer> predicate = (x) -> {
            System.out.println("Check for even nunmber: ");
            return x%2==0? true : false;
        };
        System.out.println(predicate.test(10));

        int x= 5;
        Supplier<Integer> supplier = () -> x*5;
        System.out.println("This is supplier interface: "+supplier.get());
    }
}
