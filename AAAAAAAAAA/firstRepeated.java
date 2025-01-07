package AAAAAAAAAA;

public class firstRepeated {
    package LeetCode;

public class Question9 {
    public static int findFirstDuplicate(int a[]) {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(a[i]==a[j])
                {
                    return a[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(findFirstDuplicate(a));

        int b[] = {1, 2, 3, 4, 5};
        System.out.println(findFirstDuplicate(b));
    }
}


}
