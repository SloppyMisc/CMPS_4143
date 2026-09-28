import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        int num = (in * (in + 1))/2;
        System.out.println(num);

        sc.close();
    }
}