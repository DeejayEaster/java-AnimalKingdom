package animalkingdom;

public class Mammal extends Animal {
    public Mammal(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move() {
        return name + " walks around gleefully.";
    }

    @Override
    public String breath() {
        return name + " draws air deep into their lungs.";
    }

    @Override
    public String reproduce() {
        return "Mazel tov, it's a live baby."
    }
}