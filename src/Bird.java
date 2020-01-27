public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan;//inches

    public Bird (String name, String species, int age, double weight, String color, double wingspan)
    {
        super(name, age, weight);
        this.species = species;
        this.color = color;
        this.wingspan = wingspan;
    }

    public String speak()
    {
        if(this.species.equalsIgnoreCase("Snowy Owl"))
        {
            return "screech";
        }
        return "chirp";
    }

    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;
        output += "\nColor: " + color;
        output += "\nWingspan: " + wingspan + " inches";
        return output;
    }

}
