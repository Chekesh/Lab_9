public class Cat extends Animal {

    String name;
    String animal;

    Cat(int food, String location, String animal){
        super(food, location);
        this.animal = animal;
    }

    @Override
    void makeNoise() {
        System.out.println(animal + " " + locathion + " food = " + food);
    }

    @Override
    void eat() {
        food++;
    }
}
