package LeetCode;

public class SmallPos5 {
    public static int SM(int a[]){
        int n=a.length;
        int miss=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j]==miss) {
                    miss++;
                }
            }
        }
        return miss;
    }
    public static void main(String[] args) {
        int a[]={3,2,-7,-4,5,1,6,9};
        System.out.println(SM(a));
    }
}
