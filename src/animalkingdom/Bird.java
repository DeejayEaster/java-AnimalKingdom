package animalkingdom;

public class Bird extends Animal {
    public Bird(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String breath() {
        return name + "Draws air deep into their lungs.";
    }

    @Override
    public String move() {
        return name + " flies through the air effortlessly."
    }

    @Override
    public String reproduce() {
        return "Had a healthy clutch of eggs."
    }
}