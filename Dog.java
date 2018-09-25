package lab6_polymorphism;

public class Dog
{
    private final String breed;

    public Dog(String b)
    {
        breed = b;
    }

    public void communicate()
    {
        System.out.println("bark bark");
    }

    public void move()
    {
        System.out.println("run");
    }

    public String getBreed()
    {
        return breed;
    }
}
