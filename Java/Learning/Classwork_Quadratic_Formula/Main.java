import java.util.Scanner;

/**
 * QuadraticSolution class that stores anything you might need for a quadratic solution
 */
class QuadraticSolution
{
    private int disc;
    private double x1;
    private double x2;

    /**
     * Assigns the coefficients, discriminant, and the x's if applicable.
     * 
     * @param a coefficient a
     * @param b coefficient b
     * @param c coefficient c
     */
    public QuadraticSolution(int a, int b, int c)
    {
        disc = (b * b) - (4 * a * c);
        
        if (disc >= 0)
        {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
        }
    }

    /**
     * @return The discriminant
     */
    public int getDisc()
    {
        return disc;
    }

    /**
     * @return The x1
     */
    public double getX1()
    {
        return x1;
    }

    /**
     * @return The x2
     */
    public double getX2()
    {
        return x2;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("What are your coefficients? ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        QuadraticSolution solution = new QuadraticSolution(a, b, c);

        System.out.println("Discriminant = " + solution.getDisc());

        if (solution.getDisc() < 0)
            System.out.println("There are no real solutions.");
        else if(solution.getDisc() > 0)
        {
            System.out.println("X1 = " + solution.getX1());
            System.out.println("X2 = " + solution.getX2());
        }
        else
            System.out.println("X1 = " + solution.getX1());
        sc.close();
    }
}