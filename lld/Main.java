class PolymorphismExample {

    // Overloaded method with two parameters
    public static void function(int a, int b) {
        System.out.println("The value of a and b is " + a + ", " + b);
    }

    // Overloaded method with one parameter
    public static void function(int a) {
        System.out.println("The value of a is " + a);
    }

    public static void main(String[] args) {
        // No need to create object because methods are static
        function(0);
        function(0, 1);
    }
}
