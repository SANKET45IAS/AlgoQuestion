package AAAAAAAAAA;

import java.util.Arrays;

public class ArayRed {
    public static void reduc(int a[]){
        int n=a.length;
        int count=0;
        System.out.println("Before Reduction:");
        System.out.println(Arrays.toString(a));
        System.out.println("Array Reduction:");
        for (int i = 0; i < n; i++) {
            int min=a[i];
            for (int j = i; j < n; j++) {
                a[j]-=min;
            }
            System.out.println(Arrays.toString(a));
            count++;
        }
        System.out.println("Number Reductions steps: "+count);
    }
    public static void main(String[] args) {
        int a[]={2,4,8,9,15};
        reduc(a);
    }
}
