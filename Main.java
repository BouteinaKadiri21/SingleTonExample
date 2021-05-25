public class Main {
    public static void main(String[] args) {


        Singleton x = Singleton.getInstance();


        Singleton y = Singleton.getInstance();


        Singleton z = Singleton.getInstance();








        System.out.println("String from x is " + x.num.length);


    }
}
