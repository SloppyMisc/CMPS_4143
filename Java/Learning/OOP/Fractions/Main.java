/***************************************************************************************************************
*   Conner Taylor                                                                                              *
*   CMPS 4143 - Program 1 - Dr. Johnson                                                                        *
*   September 9, 2026                                                                                            *
*   This program will create an array of 6 random numbers between 1-54 and ask the user                        *
*   for 6 random numbers between 1-54 and then will compare the numbers and then print how many digits match.  *
***************************************************************************************************************/

import java.util.*;

class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int num, int denom)
    {
        this.numerator = num;
        this.denominator = (denom == 0) ? 1 : denom;
        if(denom == 0)
            System.out.println("This number is cooked cuz you cant have a 0 as a denominator");
    }

    public void setNumerator(int n)
    {
        this.numerator = n;
    }

    public void setDenominator(int d)
    {
        this.denominator = (d == 0) ? 1 : d;
        if(d == 0)
            System.out.println("This number is cooked cuz you cant have a 0 as a denominator");
    }

    public void setFraction(int n, int d)
    {
        this.numerator = n;
        this.denominator = (d == 0) ? 1 : d;
        if(d == 0)
            System.out.println("This number is cooked cuz you cant have a 0 as a denominator");
    }

    public Fraction multiply(Fraction f)
    {
        Fraction temp = new Fraction();
        temp.numerator = f.numerator * this.numerator;
        temp.denominator = f.denominator * this.denominator;

        return temp;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Fraction frac = new Fraction();
    }
}
