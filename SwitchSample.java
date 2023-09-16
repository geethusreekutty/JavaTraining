import java.util.Scanner; 
public class SwitchSample{

    public static void main(String[] args)
    {
        Scanner scanr=new Scanner(System.in);
        System.out.println("Enter your choice");
        //int age=scanr.nextInt();
        int num=scanr.nextInt();

       // switch(age){

       /* 
        case 18 :System.out.println("You are not Eligible");
        break;
        case 22 :System.out.println("You are Eligible");
        break;
        default:System.out.println(" please enter correct choice");
        break;*/
/****for loop example */
       
    /*for(int i=0;i<=10;i++)
        {
            System.out.printf("\n %d * %d = %d",i,num,i*num);
        }*/
     //   }


     /***while loop example */
/*int i=1;
    while(i<=10)
    {
        System.out.printf("\n %d * %d = %d",i,num,i*num);
        i++;
    }*/
/*do while loop example */
int i = 0;
 
do {

    // Body of loop that will execute minimum
    // 1 time for sure no matter what
     System.out.printf("\n %d * %d = %d",i,num,i*num);
    i++;
}

// Checking condition
// Note: It is being checked after
// minimum 1 iteration
while (i < 10);


        scanr.close();
        }
    }
    
