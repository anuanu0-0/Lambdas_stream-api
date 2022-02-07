package FirstLambda;

public class WellWisherLambda {
    private static void wish(Greeting greeting) {
        greeting.greet();
    }
    public static void main(String[] args) {
        wish(() -> System.out.println("HI THERE"));
    }
}
