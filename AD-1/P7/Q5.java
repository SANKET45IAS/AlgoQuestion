package P7;

public class Q5 {
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 4, 2, 7}; 
        System.out.println("Element Frequencies:"); 
 
        int maxCount = 0;
        int maxElem = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElem = arr[i];
            }
        }
        System.out.println(maxElem);
    } 
}

