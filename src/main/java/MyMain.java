import java.util.Scanner;
public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10;
        double m;
        double y;
        do { 
            m = (n + (x/n))/2;
            System.out.println(m);
            y = m - n;
            y = Math.abs(y);
            n = m;
        }
        while ( y >  0.00001);
        return m;
    }
    // Calculates the factorial of a number
    public static double factorial(int x) {
        double y = 1;
        for (int i = x; i > 0; i--) {
            y = y * i;
        }
        return y;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        int z = 0;
        double y = 1/factorial(z);
        double j = Math.E;
        double difference;
        do {
            difference = j - y;
            z = z + 1;
            y = y + (1/factorial(z));
        }
        while (difference > 0.00001);
        return y;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        Double num = Double.parseDouble(scan.next());
        System.out.println("The square root of " + num + " is " + babylonian(num));
        System.out.println("The value of e is roughly: " + calculateE());
        scan.close();
    }
}