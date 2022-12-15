package animalPack;

public class Dog extends Animal{

   public Dog(){

    }
    public Dog(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Woof Woff!");
    }
}
