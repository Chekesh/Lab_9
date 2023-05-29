public class Animal {
    int food;
    String locathion;

    Animal(int food, String locathion) {
        this.food = food;
        this.locathion = locathion;
    }
    void eat() {
        this.food++;
    }
    void sleep() {
        this.locathion = "спит";
    }

    void makeNoise() {
        System.out.println("food=" + food + "locathion" + locathion);
    }
}
