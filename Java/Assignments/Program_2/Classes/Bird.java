package Classes;

public class Bird extends Animal

{

    private String habitat;

    /**
     * Default constructor
     */
    public Bird()
    {
        super();
        this.habitat = "Unknown";
    }

    /**
     * Overloaded Constructor with a string.
     * @param n a String
     */
    public Bird(String n)
    {
        super(n);
        this.habitat = "Unknown";
    }

    /**
     * Overloaded Constructor with an int.
     * @param a an int
     */
    public Bird(int a)
    {
        super(a);
        this.habitat = "Unknown";
    }

    /**
     * Overloaded Constructor with a String and an int.
     * @param n a String
     * @param a an int
     */
    public Bird(String n, int a)
    {
        super(n, a);
        this.habitat = "Unknown";
    }

    /**
     * Overloaded Constructor with a String, an int, and a String.
     * @param n a String
     * @param a an int
     * @param b a String
     */
    public Bird(String n, int a, String b)
    {
        super(n, a);
        this.habitat = b;
    }

    /**
     * A getter for the habitat which is a String.
     * @return String
     */
    public String getHabitat()
    {
        return this.habitat;
    }

    /**
     * A setter for the habitat which is a String.
     * @param b a String
     */
    public void setHabitat(String b)
    {
        this.habitat = b;
    }

    /**
     * Member function that displays all of the information.
     */
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("This Bird lives in the " + this.habitat + " habitat.");
    }

    /**
     * Member function that displays the sound that the bird makes.
     */
    @Override
    public void makeSound()
    {
        System.out.println("Chirp!");
    }

}