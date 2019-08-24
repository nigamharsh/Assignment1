package gravity;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        double t;
        double g = 9.8;
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        double speed = (g * t);
        double distance = (0.5 * (g * (t * t)));
        System.out.println("The speed of the object at " + t + " seconds after its release is " + speed + " and the distance the object has travelled in the " + t + " seconds after the release is " + distance);
    }
}
