public class Dog extends Pet
{
    private String breed;

    public Dog (String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }//end of dog constructor

    public String speak()
    {
        if (this.age < 1)
        {
          return "yip";
        }
        return "bark";
    }

    public String toString()
    {

       String output = super.toString() + "\nBreed: " + breed;

        return output;
    }//end of toString
}//end of class Dog
