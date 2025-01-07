package AAAAAAAAAA;

public class GCD {
    public static int GD(int a,int b){
        int result=1;
        for (int i = 1; i <=a; i++) {
            if (a%i==0 && b%i==0) {
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(GD(36, 60));
    }
}
