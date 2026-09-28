import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int[] getDivisors(int n)
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                list.add(i);
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static char perfectNum(int n)
    {
        char result = 'P';
        int[] divisors = getDivisors(n);
        int sum = 0;
        for (int d : divisors) {
            sum += d;
        }
        if (sum < n)
            result = 'D';
        else if (sum > n) 
            result = 'A';

        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char answer = perfectNum(n);

        System.out.println(answer);
    }
}
