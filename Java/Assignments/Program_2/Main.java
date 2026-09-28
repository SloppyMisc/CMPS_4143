import Classes.*;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(new File("animals.txt"));

        while (sc.hasNextLine())
        {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(",");
            String type = parts[0].trim();
            String name = parts[1].trim();
            int age = Integer.parseInt(parts[2].trim());
            String detail = parts[3].trim();

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
            }
        }
        sc.close();

        for (Animal a : animals)
        {
            a.displayInfo();
            a.makeSound();
            System.out.println("-----------------------------");
        }
    }
}