public class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}

class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
}
