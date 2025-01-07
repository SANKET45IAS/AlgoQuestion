package LeetCode;

public class DuplicateList {
    public static void duplicate(int a[]) {
        int n = a.length;
        boolean check[] = new boolean[n];
        System.out.println("Duplicate Elements are:");
        
        for (int i = 0; i < n; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j] && !check[j]) {
                    System.out.println(a[i]);
                    check[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 4, 5, 1};
        duplicate(a);
    } 
}

