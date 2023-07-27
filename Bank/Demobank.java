package Bank;

public class Demobank {
    public static void main(String [] args ){
        Bank t ;
        t = new Mbbank();
        System.out.println("Mbbank Rate of Interest :"+t.getOfInterest());
        t = new Bidv();
        System.out.println("Bidv Rate of Interest :" +t.getOfInterest());
        t = new Momo();
        System.out.println("Momo Rate of Interest :"+t.getOfInterest());
    }
}
