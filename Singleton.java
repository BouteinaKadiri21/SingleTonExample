public class Singleton {
static int compteur;
    private static Singleton single_instance = null;


    public int[ ] num ={1,2,3,4,5,6,77777};


    private Singleton()
    {
        int  s = num.length;
        compteur++;
    }


    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
