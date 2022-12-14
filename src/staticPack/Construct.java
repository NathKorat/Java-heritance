package staticPack;

public class Construct {
    // Class Attributes
    String name;
    int age;
    static int counter = 0;

    // constructor
    Construct(String n, int a){
        this.name = n;
        this.age = a;
        counter ++;
    }

    // Default constructor
    Construct(){
        counter ++;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Construct obj1 = new Construct();
        
        System.out.println(Construct.counter);

    }

}
