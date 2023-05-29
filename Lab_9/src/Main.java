public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog(50, "бодорствует", "Собака");
        dog.eat();
        Animal cat = new Cat(30, "бодорствует", "Кот");
        cat.eat();
        cat.makeNoise();
        Animal horse = new Horse(70, "бодорствует", "лошадь");
        horse.eat();
        horse.sleep();
        Vet.treatAnimal(dog);
        Vet.treatAnimal(cat);
        Vet.treatAnimal(horse);
    }
}