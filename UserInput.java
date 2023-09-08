import java.util.Scanner;

public class UserInput{
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        

        System.out.println("Enter your age");
        int age=scan.nextInt();
        

        System.out.println("Enter your mobilenumber");
        int mob=scan.nextInt();

        
        System.out.println("Enter your Address");
        String add=scan.next();

        System.out.println("Name is:"+name);
        System.out.println("Age :"+age);
        System.out.println("Mobilenumber :"+mob);
        System.out.println("Address :"+add);

        scan.close();

    }
}