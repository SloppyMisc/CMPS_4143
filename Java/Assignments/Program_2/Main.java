/***************************************************************************************************************
*   Conner Taylor                                                                                              *
*   CMPS 4143 - Program 2 - Dr. Johnson                                                                        *
*   August 31, 2026                                                                                            *
*   This program demonstrates inheritance using an Animal superclass and three subclasses, which are Dog, Cat, *
*   and Bird. Each animal inherits the basic behaviors from the Animal class and overrides the displayInfo     *
*   and makeSound functions. The program reads animal information from a file, creates the correct animal      *
*   objects, stores them in an ArrayList, and then displays their information and sounds in the console.       *
***************************************************************************************************************/
import Classes.*;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    /**
     * Prints the program header.
     */
    public static void printHeader()
    {
        System.out.println();
        System.out.println("Conner Taylor");
        System.out.println("CMPS 4143 - Program 2 - Dr. Johnson");
        System.out.println("August 31, 2026");
        System.out.println("This program demonstrates inheritance using an Animal");
        System.out.println("superclass and three subclasses, which are Dog, Cat, and");
        System.out.println("Bird. Each animal inherits the basic behaviors from the");
        System.out.println("Animal class and overrides the displayInfo and makeSound");
        System.out.println("functions. The program reads animal information from a");
        System.out.println("file, creates the correct animal objects, stores them in an");
        System.out.println("ArrayList, and then displays their information and sounds");
        System.out.println("in the console.");
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException
    {
        printHeader();

        // Required ArrayList for the assignment
        ArrayList<Animal> animals = new ArrayList<>();

        // Scanner for the file type
        Scanner sc = new Scanner(new File("animals.txt"));

        while (sc.hasNextLine())
        {
            // While theres a next line parse the line
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            // Splits the data by comma's
            String[] parts = line.split(",");
            String type = parts[0].trim();
            String name = parts[1].trim();
            int age = Integer.parseInt(parts[2].trim());
            String detail = parts[3].trim();

            // Determines what to do if something gets selected
            switch (type.toLowerCase())
            {
                case "dog":
                    animals.add(new Dog(name, age, detail));
                    break;
                case "cat":
                    animals.add(new Cat(name, age, detail));
                    break;
                case "bird":
                    animals.add(new Bird(name, age, detail));
                    break;
                // now I probably should add default but like nahh I make the data.
            }
        }
        sc.close();

        // Displays the info
        for (Animal a : animals)
        {
            a.displayInfo();
            a.makeSound();
            System.out.println("-----------------------------");
        }
    }
}