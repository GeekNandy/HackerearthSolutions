import java.util.*;

class TestClass {

    public static int getHandsOverlapCount(String[] arr) {
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        return (((60 * h) + m) * 11) / 720 + 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.print(getHandsOverlapCount(s.split(":")));
    }
}
