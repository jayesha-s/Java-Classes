import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1= sc.nextInt();
        System.out.print("Enter another number: ");
        int num2= sc.nextInt();

        Calculator calc1 = new Calculator(num1,num2);

        System.out.println("\n What calculation would you like to conduct?" +
                "\n div = 1" +
                "\n mul = 2" +
                "\n add = 3" +
                "\n sub = 4");

        Scanner nt= new Scanner(System.in);

        System.out.println("\n Enter your response:");
        int userInstruction = nt.nextInt();

        do{
            if(userInstruction == 1){
                System.out.println("\n" + calc1.divide(num1,num2));
                break;
            }
            else if(userInstruction == 2){
                System.out.println("\n" + calc1.multipy(num1,num2));
                break;
            }
            else if(userInstruction == 3){
                System.out.println("\n" + calc1.add(num1,num2));
                break;
            }
            else if(userInstruction == 4){
                System.out.println("\n" + calc1.subtract(num1,num2));
                break;
            }
            else{
                System.out.println("\n Please enter a number between 1-4:");
                userInstruction = nt.nextInt();
            }

        } while(true);


    }
}  