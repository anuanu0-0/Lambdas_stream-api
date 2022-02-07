package FirstLambda;

public class WellWisherAnonymousClass {
    private static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String[] args) {
        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("HOLA");
            }
        });
    }

}
