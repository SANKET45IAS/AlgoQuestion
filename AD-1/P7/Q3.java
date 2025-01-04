package P7;

public class Q3 {
    public static int findMissingNumber(int[] a, int n) {
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;
        for (int num : a) {
            currentSum += num;
        }
        return totalSum - currentSum;
    }

    public static void main(String[] args) {
        int[] a = {3,4,2};
        int n =3;
        System.out.println(findMissingNumber(a, n)); 
    }    
}

