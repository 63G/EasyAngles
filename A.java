import java.util.Scanner;

public class A {
    public static void main (String[] args) {
        // Three points required to make a triangle
        double x1, x2,x3;
        double y1, y2, y3;
        System.out.println("Enter Desired points");
        Scanner inputP = new Scanner(System.in);
        // receiving points as input
        x1 = inputP.nextDouble();
        y1 = inputP.nextDouble();
        x2 = inputP.nextDouble();
        y2 = inputP.nextDouble();
        x3 = inputP.nextDouble();
        y3 = inputP.nextDouble();
        // finding lengths of each leg of a triangle
        double a, b, c;
        a = Math.sqrt(Math.pow((x3 - x2), 2) - Math.pow((y3 - y2), 2));
        b = Math.sqrt(Math.pow((x1 - x3), 2) - Math.pow((y1 - y3), 2));
        c = Math.sqrt(Math.pow((x1 - x2), 2) - Math.pow((y1 - y2), 2));
        // finding three angles of the triangle
        double A, B, C;
        A = Math.toDegrees(Math.acos((a*a - b*b - c * c) / (-2 * b * c)));
        B = Math.toDegrees(Math.acos((b*b - a*a  - c * c) / (-2 * a * c)));
        C = Math.toDegrees(Math.acos((c * c - a*a - b*b) / (-2 * b * a)));

        System.out.printf("The angles are: A = %.2f, B = %.2f, C = %.2f" , A, B, C);




    }
}
