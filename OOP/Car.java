package OOP;

public class Car {

    private class Engine {

        int horsepower;
    }
    Engine e;

    public Car() {
        e = new Engine();
        e.horsepower = 100;
    }
}
