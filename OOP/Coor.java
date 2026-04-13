package OOP;

// blueprints of Coor 
public class Coor {

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
        this.x = 0;
        this.y = 0;
        coorCount++;
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

    /*
    access modifier
    public: can be accessed from anywhere
    private: can only be accessed within the class
    default (no modifier): can be accessed within the same package
    protected: can be accessed within the same package and subclasses
     */
    public static void CoorCount() {
        System.out.println(x);
    }
}
