package Classes;

public class Cat extends Animal
{
    private String owner;

    public Cat()
    {
        super();
        this.owner = "Unknown";
    }

    public Cat(String n)
    {
        super(n);
        this.owner = "Unknown";
    }

    public Cat(int a)
    {
        super(a);
        this.owner = "Unknown";
    }

    public Cat(String n, int a)
    {
        super(n, a);
        this.owner = "Unknown";
    }

    public Cat(String n, int a, String o)
    {
        super(n, a);
        this.owner = o;
    }

    // Getters
    public String getOwner()
    {
        return this.owner;
    }

    // Setters
    public void setOwner(String o)
    {
        this.owner = o;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This Cat is owned by " + this.owner + ".");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Meow!");
    }
}