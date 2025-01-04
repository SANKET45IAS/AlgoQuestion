package P6;

public class Q2 {
    public static int lino(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4};
        int target = 4;
        int result = lino(arr, target);
        if (result != -1) {
            System.out.println("Element at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    
}
