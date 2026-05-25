package OOP;

import java.util.*;

public class OOP {

    // Object-Oriented Programming
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter x coor: ");
        double x = sc.nextDouble();
        System.out.print("please enter y coor: ");
        double y = sc.nextDouble();
        Coor cxy = new Coor(x, y); // xy coordinate 
        System.out.println("(" + cxy.x + ", " + cxy.y + ")");

        // freshly made from factory
        Coor c1 = new Coor(1, 2); // construct a Coor object
        // customize/monipulate how the object 
        c1.x = 1;
        c1.y = 2;

        System.out.println("Number of Coor: " + Coor.coorCount);
        System.out.println("Number of Coor: " + c1.coorCount);

        // default constructor: no parameters, default values
        Coor c2 = new Coor();
        c2.x = 3;
        c2.y = 4;

        Coor c3 = new Coor(3, 4); // instantiate
        System.out.println(c2.equals(c3)); // true
        "a".compareTo("b"); // -1 "a" - "b"

        System.out.println("C1: (" + c1.x + ", " + c1.y + ")");
        System.out.println("C2: (" + c2.x + ", " + c2.y + ")");

        System.out.println();

        c1.incrementX();
        System.out.println("C1: (" + c1.x + ", " + c1.y + ")");
        System.out.println("C3 distance from origin: " + c3.distanceFromOrigin());

        c1.x = 100; // we can directly access and change the field variable, which is not safe

        System.out.println("Number of Coor: " + Coor.coorCount);
    }
}
