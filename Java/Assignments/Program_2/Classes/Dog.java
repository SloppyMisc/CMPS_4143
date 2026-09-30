package Classes;

public class Dog extends Animal

{

    private String breed;

    /**
     * Default constructor
     */
    public Dog()
    {
        super();
        this.breed = "Stray";
    }

    /**
     * Overloaded Constructor with a string.
     * @param n a String
     */
    public Dog(String n)
    {
        super(n);
        this.breed = "Stray";
    }

    /**
     * Overloaded Constructor with an int.
     * @param a an int
     */
    public Dog(int a)
    {
        super(a);
        this.breed = "Stray";
    }

    /**
     * Overloaded Constructor with a String and an int.
     * @param n a String
     * @param a an int
     */
    public Dog(String n, int a)
    {
        super(n, a);
        this.breed = "Stray";
    }

    /**
     * Overloaded Constructor with a String, an int, and a String.
     * @param n a String
     * @param a an int
     * @param b a String
     */
    public Dog(String n, int a, String b)
    {
        super(n, a);
        this.breed = b;
    }

    /**
     * A getter for the breed which is a String.
     * @return String
     */
    public String getBreed()
    {
        return this.breed;
    }

    /**
     * A setter for the breed which is a String.
     * @param b a String
     */
    public void setBreed(String b)
    {
        this.breed = b;
    }

    /**
     * Member function that displays all of the information.
     */
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This dog is a " + this.breed + ".");
    }

    /**
     * Member function that displays the sound that the dog makes.
     */
    @Override
    public void makeSound()
    {
        System.out.println("Woof!");
    }

}