package Classes;

public class Animal
{
    private String name;
    private int age;

    public Animal()
    {
        this.name = "";
        this.age = 1;
    }

    public Animal(String n)
    {
        this.name = n;
    }
    public Animal(int a)
    {
        this.age = a;
    }
    public Animal(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }

    // Setters
    public void setName(String n)
    {
        this.name = n;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public void displayInfo()
    {
        System.out.println("This animals name is " + this.name + ".");
        System.out.println("This animal is " + this.age + " years old.");
    }

    public void makeSound()
    {
        System.out.println("Sound");
    }
}

