package FirstLambda;

public class WellWisher {
    public static void main(String[] args) {
        wish(new HindiGreeting());
        wish(new EnglishGreeting());
    }

    private static void wish(Greeting greeting) {
        greeting.greet();
    }
}
