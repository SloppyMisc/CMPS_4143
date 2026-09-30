package Classes;

public class Animal
{
    private String name;
    private int age;

    /**
     * Default constructor
     */
    public Animal()
    {
        this.name = "";
        this.age = 1;
    }
    
    /**
     * Overloaded Constructor with a string.
     * @param n a String
     */
    public Animal(String n)
    {
        this.name = n;
    }

    /**
     * Overloaded Constructor with an int.
     * @param a an int
    */
    public Animal(int a)
    {
        this.age = a;
    }

    /**
     * Overloaded Constructor with a String and an int.
     * @param n a String
     * @param a an int
     */
    public Animal(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    /**
     * A getter for the name which is a String.
     * @return String
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * A getter for the age which is an int.
     * @return int
    */
    public int getAge()
    {
        return this.age;
    }

    /**
     * A setter for the name which is a String.
     * @param n a String
     */
    public void setName(String n)
    {
        this.name = n;
    }

    /**
     * A setter for the age which is an int.
     * @param a an int
     */
    public void setAge(int a)
    {
        this.age = a;
    }

    /**
     * Member function that displays all of the information.
     */
    public void displayInfo()
    {
        System.out.println("This animals name is " + this.name + ".");
        System.out.println("This animal is " + this.age + " years old.");
    }

    /**
     * Member function that displays the sound that the animal makes.
     */
    public void makeSound()
    {
        System.out.println("Sound");
    }
}

