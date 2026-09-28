package Classes;

public class Bird extends Animal
{
    private String habitat;

    public Bird()
    {
        super();
        this.habitat = "Unknown";
    }

    public Bird(String n)
    {
        super(n);
        this.habitat = "Unknown";
    }

    public Bird(int a)
    {
        super(a);
        this.habitat = "Unknown";
    }

    public Bird(String n, int a)
    {
        super(n, a);
        this.habitat = "Unknown";
    }

    public Bird(String n, int a, String b)
    {
        super(n, a);
        this.habitat = b;
    }

    // Getters
    public String getHabitat()
    {
        return this.habitat;
    }

    // Setters
    public void setHabitat(String b)
    {
        this.habitat = b;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This Bird lives in the " + this.habitat + " habitat.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Chirp!");
    }
}