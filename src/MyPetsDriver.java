public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        Lizard mochi = new Lizard("Mochi", "Blue-Toungued Skink", 8, 2.2);
        Bird hedwig = new Bird("Hedwig", "Snowy Owl", 3, 25.2, "White", 25.6);

        // print outs
        System.out.println(rex);
        System.out.println(mochi);
        System.out.println(hedwig);
    }
}
