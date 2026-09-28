/***************************************************************************************************************
*   Conner Taylor                                                                                              *
*   CMPS 4143 - Program 1 - Dr. Johnson                                                                        *
*   August 31, 2026                                                                                            *
*   This program will create an array of 6 random numbers between 1-54 and ask the user                        *
*   for 6 random numbers between 1-54 and then will compare the numbers and then print how many digits match.  *
***************************************************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Main
{
    /**
    * Prints a header for the program.
    */
    public static void printHeader()
    {
        System.out.println("Conner Taylor");
        System.out.println("CMPS 4143 - Program 1 - Dr. Johnson");
        System.out.println("August 31, 2026");
        System.out.println("This program will create an array of 6 random numbers between 1-54 and ask the user");
        System.out.println("for 6 random numbers between 1-54 and then will compare the numbers and then print how many digits match.");
    }

    /**
    * Generates an integer array full of 6 random integers ranging from 1-54.
    */
    public static int[] generateRandomArr()
    {
        int randomArr[] = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++)
        {
            int num;
            boolean duplicate;

            do {
                num = random.nextInt(54) + 1;
                duplicate = false;

                for (int j = 0; j < i; j++)
                {
                    if (randomArr[j] == num)
                    {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);
            
            randomArr[i] = num;
        }
        return randomArr;
    }

    /**
    * Generates an integer array full of 6 integers inputed by the user ranging from 1-54.
    */
    public static int[] generateInputArr()
    {
        int inputArr[] =  new int[6];
        Scanner sc = new Scanner(System.in);

        int input;
        boolean valid = false;

        for(int i = 0; i < 6; i++)
        {
            do {
                System.out.print("Enter integer " + (i + 1) + " (1-54): ");
                input = sc.nextInt();
                valid = input >= 1 && input <= 54;
                if (!valid) {
                    System.out.println("Invalid. Must be between 1 and 54.");
                }
            } while (!valid);

            inputArr[i] = input;
        }

        sc.close();
        return inputArr;
    }

    /**
    * Prints an array in the form of { ... } where ... is the array.
    * 
    * @param arr an integer array.
    */
    public static void printArr(int arr[])
    {
        System.out.print("{");
        for(int num : arr)
            System.out.print(" " + num + " ");
        System.out.println("}");
    }

    /**
     * Counts how many matching digits are in the 2 arrays passed.
     * 
     * @param arr an integer array
     * @param arr2 an integer array
     * @return the number of matches in both of the arrays.
     */
    public static int countMatches(int[] arr, int[] arr2)
    {
        int count = 0;
        for (int a : arr) {
            for (int b : arr2) {
                if (a == b) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        printHeader();
        int randomArr[] = generateRandomArr();
        int inputArr[] =  generateInputArr();

        printArr(randomArr);
        printArr(inputArr);

        int match = countMatches(randomArr, inputArr);

        System.out.println("You have " + match + " matches!");
    }
}

