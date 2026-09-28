import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // int in = sc.nextInt();
        // if(in != 0)
        // {
        //     if(in > 0)
        //         System.out.println("Positive");
        //     else if(in < 0)
        //         System.out.println("Negative");
        //     else
                

        //     if(in % 2 == 0)
        //         System.out.println("Even");
        //     else
        //         System.out.println("Odd");
        // }else
        //     System.out.println("Zero");

        System.out.println("How many pizzas? ");
        int pizzas = sc.nextInt();

        System.out.println("What type of pizza? ");
        String typePizza = sc.nextLine();

        
        sc.close();
    }
}