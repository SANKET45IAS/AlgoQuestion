package AAAAAAAAAA;

public class Fibonnaci {
    public static void main(String[] args) {
        int n=8;
        System.out.print(n+"th Fibonnaci Series: ");
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 3; i <=n; i++) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
