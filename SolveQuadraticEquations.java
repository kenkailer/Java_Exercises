import java.util.Scanner;

public class SolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble(); double b = input.nextDouble(); double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4)) / (2 * a);

        if(discriminant < 0)
            System.out.println("The equation has no real roots");
        else if(discriminant > 0)
            System.out.println("The equation has two real roots: " + (int)(r1 * 1000000) / 1000000.0
                                                    + " and " + (int)(r2 * 100000) / 100000.0);
        else
            System.out.println("The equation has one root " + (int)(-b / 2 * a));
    }
}
