import staticPack.*;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.name = "Mno";
        p1.age = 22;
        p1.gender = "M";

        Student st1 = new Student();
        st1.name = "Seakngim";
        st1.age = 22;
        st1.gender = "F";
        st1.class_level = 3;
        st1.major = "CS";

        Teacher tc1 = new Teacher();
        tc1.name = "Udom";
        tc1.age = 30;
        tc1.gender = "M";
        tc1.salary = 2000;
        tc1.course = "SQL";
    }
}
