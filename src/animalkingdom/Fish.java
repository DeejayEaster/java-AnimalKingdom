package animalkingdom;

public class Fish extends Animal {
    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String breath() {
        return name + " filters oxygen from water using gills!";
    }

    @Override
    public String move() {
        return name + " swims through the water effortlessly."
    }

    @Override
    public String reproduce() {
        return name + " has had a healthy clutch of eggs."
    }
}