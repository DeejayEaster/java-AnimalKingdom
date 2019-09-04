package animalkingdom;

public abstract class Animal {
    public static int maxId = 0;

    int animalId;
    int yearNamed;
    String name;

    public Animal(String name, int yearNamed) {
        this.name = name;
        this.yearNamed = yearNamed;
        this.animalId = maxId++;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    public String eat() {
        return "Nom Nom Nom!";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearNamed() {
        return yearNamed;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public int getAnimalId() {
        return animalId;
    }

}