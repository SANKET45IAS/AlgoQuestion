package AAAAAAAAAA;

import java.util.Arrays;

public class MergeTwo {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
        int n1=a1.length;
        int a2[]={7,8,9,10,11};
        int n2=a2.length;

        int a3[]=new int[n1+n2];
        
        int i3=0;
        
        for (int i = 0; i <n1; i++) {
            a3[i3++]=a1[i];
        }
        for (int i = 0; i <n2; i++) {
            a3[i3++]=a2[i];
        }

        System.out.println(Arrays.toString(a3));

    }
}
