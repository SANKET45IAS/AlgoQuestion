package P1;
import java.util.Arrays;

public class Q3 {
    static void rotate(int ar[],int i,int j){
        while (i<j) {
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;           
        }
    }

    public static void main(String[] args) {
       int [] ar={1,2,3,4,5,6,7};
       int k=3;
       rotate(ar, 0, ar.length);
       rotate(ar,0, k-1);
       rotate(ar, k, ar.length-1);

       
       for (int i = 0; i < ar.length; i++) {
        System.out.println(Arrays.toString(ar));
       }
    }
}
