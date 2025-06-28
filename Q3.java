// Q3)Sum all the numbers greater than 5 in the integer list using streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FlatMap{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int result = list.stream().filter(x->x<=5).mapToInt(x->x).sum();
        System.out.println(result);
    }
}
