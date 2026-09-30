package Classes;

public class Cat extends Animal
{

    private String owner;

    /**
     * Default constructor
     */
    public Cat()
    {
        super();
        this.owner = "Unknown";
    }

    /**
     * Overloaded Constructor with a string.
     * @param n a String
     */
    public Cat(String n)
    {
        super(n);
        this.owner = "Unknown";
    }

    /**
     * Overloaded Constructor with an int.
     * @param a an int
     */
    public Cat(int a)
    {
        super(a);
        this.owner = "Unknown";
    }

    /**
     * Overloaded Constructor with a String and an int.
     * @param n a String
     * @param a an int
     */
    public Cat(String n, int a)
    {
        super(n, a);
        this.owner = "Unknown";
    }

    /**
     * Overloaded Constructor with a String, an int, and a String.
     * @param n a String
     * @param a an int
     * @param o a String
     */
    public Cat(String n, int a, String o)
    {
        super(n, a);
        this.owner = o;
    }

    /**
     * A getter for the owner which is a String.
     * @return String
     */
    public String getOwner()
    {
        return this.owner;
    }

    /**
     * A setter for the owner which is a String.
     * @param o a String
     */
    public void setOwner(String o)
    {
        this.owner = o;
    }

    /**
     * Member function that displays all of the information.
     */
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This Cat is owned by " + this.owner + ".");
    }

    /**
     * Member function that displays the sound that the cat makes.
     */
    @Override
    public void makeSound()
    {
        System.out.println("Meow!");
    }
}
