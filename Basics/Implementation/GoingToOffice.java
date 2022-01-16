import java.util.*;

class TestClass {

    static String getTaxi(long D, long Oc, long Of, long Od, long Cs, long Cb, long Cm, long Cd) {
        long val1 = Oc + (D - Of) * Od;
        long val2 = Cb + (D / Cs) * Cm + D * Cd;
        return (val1 <= val2) ? "Online Taxi" : "Classic Taxi";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long D = scan.nextLong();
        long Oc = scan.nextLong();
        long Of = scan.nextLong();
        long Od = scan.nextLong();
        long Cs = scan.nextLong();
        long Cb = scan.nextLong();
        long Cm = scan.nextLong();
        long Cd = scan.nextLong();
        System.out.println(getTaxi(D, Oc, Of, Od, Cs, Cb, Cm, Cd));
    }
}
