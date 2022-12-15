import animalPack.*;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.bark();
        dog1.eat();
        dog1.run();
        
        cat1.eat();
    }
}
