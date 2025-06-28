// Write a program to showcase the use of optional class

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FlatMap{
    public static void main(String[] args) {
        String name = null;

        Optional<String> nameAsOptional = Optional.ofNullable(name);

        System.out.println(nameAsOptional.isEmpty());
        System.out.println(nameAsOptional.isPresent());
        System.out.println(nameAsOptional.orElse("Aman"));
    }
}
