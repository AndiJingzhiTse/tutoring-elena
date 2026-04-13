package OOP;

public class OOP {

    // Object-Oriented Programming
    public static void main(String[] args) {
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

        Coor c3 = new Coor(3, 4);

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
