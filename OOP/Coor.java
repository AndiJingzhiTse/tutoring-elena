package OOP;

// blueprints of Coor 

public class Coor implements Comparable<Coor> {

    /*
    extends class
    implements interface
    */
    /*
    equals() compareTo(), indexOf    instanceof

    interface
    concrete vs abstract (interface, abstract class)
     */

    /*
    feedMilk - interface
    mammals - abstract class, implements feedMilk
    dog, cat, human - concrete class, extends mammals
    */
 /*
    static: belongs to the class, not the object, line of car
    instance: belongs to the object, car itself
     */
    // stores data
    double x; // instance field variable
    double y;

    static int coorCount = 0;

    // data hiding, encapsulation
    // with a getter and setter, this is called property
    private String password; // not safe

    // constructor
    // no return type, not even void
    public Coor(double x, double y) {
        // we want field variable x = parameter x
        this.x = x;
        this.y = y;
        Coor.coorCount++;
    }

    // overloaded constructor: same name, different parameters
    public Coor() {
        // default to (0,0)
        // this.x = 0;
        // this.y = 0;
        // coorCount++;

        this(0, 0);
    }

    // actions, doer
    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y); // Math.sqrt(x^2 + y^2)
    }

    // getter and setter for password
    public String getPassword() {
        // authenticate first, then give user the password
        return password;
    }

    public void setPassword(String password) {
        // authenticate first, then change the password
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        // can access this
        if (obj instanceof Coor) {
            Coor smth = (Coor) obj; // downcasting
            return this.x == smth.x && this.y == smth.y;
        }
        return false;
    }

    // (2,3).compareTo((2,5)) -> -2
    public int compareTo(Coor other) {
        if (this.x != other.x) {
            return (int) (x - other.x);
        } else {
            // y is tie breaker
            return (int) (y - other.y);
        }
    }
}
