package test1;

public class Car {

    Engine e;
    String name;

    public Car(String name, int maxSpeed, int zeroBack) {
        this.name = name;
        e = new Engine(maxSpeed, zeroBack);
    }

    public void engineInfo() {
        System.out.println(this.name + " " + e.info());
    }

}
