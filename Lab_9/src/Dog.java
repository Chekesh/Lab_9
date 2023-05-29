public class Dog extends Animal {
    String animal;

    Dog(int food, String location, String animal) {
        super(food, location);
        this.animal = animal;
    }

    @Override
    void makeNoise() {
        System.out.println(animal + " " + locathion);// this
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    void eat() {
        this.food--;
    }
}
