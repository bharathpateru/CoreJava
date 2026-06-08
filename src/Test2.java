import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String name1= "java springboot";
        //String reversed = new StringBuilder(name).reverse().toString();
        //System.out.println(reversed);
        Optional<String> reduce = Stream.of(name1.split("")).reduce((a, b) -> b + a);
        reduce.ifPresent(System.out::println);




        String name= "java springboot";
        Optional<String> revOptional = Arrays.stream(name.split("")).reduce((a, b) -> b + a);
        revOptional.ifPresent(System.out::println);  // output : toobgnirps avaj





    }
}