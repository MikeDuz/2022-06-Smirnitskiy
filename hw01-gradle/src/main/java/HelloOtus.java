import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<Integer> intList = Lists.newArrayList(1, 35, 8, 15, 25);
        intList.forEach(System.out::println);

    }

}
