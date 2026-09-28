package Classes;

public class Dog extends Animal
{
    private String breed;

    public Dog()
    {
        super();
        this.breed = "Stray";
    }

    public Dog(String n)
    {
        super(n);
        this.breed = "Stray";
    }

    public Dog(int a)
    {
        super(a);
        this.breed = "Stray";
    }

    public Dog(String n, int a)
    {
        super(n, a);
        this.breed = "Stray";
    }

    public Dog(String n, int a, String b)
    {
        super(n, a);
        this.breed = b;
    }

    // Getters
    public String getBreed()
    {
        return this.breed;
    }

    // Setters
    public void setBreed(String b)
    {
        this.breed = b;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This dog is a " + this.breed + ".");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Woof!");
    }
}