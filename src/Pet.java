import java.text.DecimalFormat; // to format the weight in lbs
public abstract class Pet
{
    protected String name;
    protected int age;
    protected double weight;// in kg
    DecimalFormat fmt = new DecimalFormat("#.#");// create formatting object

    public Pet (String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }// end of pet constructor

    public String getName()
    {
        return name;
    }// end name getter

    public void setName(String name)
    {
        this.name = name;
    }// end of name setter

    abstract public String speak();// to override child classes

    public double kgToPounds()
    {
        return weight * 2.205;
    }// end of conversion method

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg" + "(" + fmt.format(kgToPounds()) + " in pounds)";
        return output;
    }// end of parent toString
}//end of pet class
