class Human
{
    private String name;

    // Constructor
    public Human(String humanName)
    {
        this.name = humanName;
    }

    // Methods
    public void printName()
    {
        System.out.println("Name: " + name);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        String names[] = {"Conner", "Zayne", "Emmanuel", "Daniel"};
        int nums[] = {54, 34, 67, 89, 64};
        int num[] = {34,54,35,64};

        Human humans[] = {new Human("Conner"), new Human("Daniel"), new Human("Zayne")};

        System.out.println(names.getClass());
        System.out.println(nums.getClass());
        System.out.println(humans.getClass());
        if(num.getClass() == nums.getClass())
        {
            System.out.println("hello");
        }
    }
}