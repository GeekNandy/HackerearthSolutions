import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        char[] arr=str.toCharArray();
        int flag, ctr=0, n=arr.length;
        for(int i=0;i<n;i++) {
            flag=0;
            if(arr[i]==')') continue;
            for(int j=i;j<(i+n);j++) {
                if(arr[(j%n)]!='(' ) flag--;
                else flag++;
                if(flag<0) break;
            }
            if(flag==0) ctr++;
        }
        System.out.println(ctr);
    }
}
