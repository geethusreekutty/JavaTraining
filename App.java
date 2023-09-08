public class App{
    public static void main(String[] args){

        Student std1=new Student();
        std1.name="Geethu";
        std1.age=30;
        std1.regNo="u123";
        System.out.println("First student name: " + std1.name + " Age: " + std1.age + " registerNumber: " + std1.regNo);

        Student std2=new Student();
        std2.name="Neethu";
        std2.age=23;
        std2.regNo="u1234";
        System.out.println("Second student name: " + std2.name + " Age: " + std2.age + " registerNumber: " + std2.regNo);

    }
    
}