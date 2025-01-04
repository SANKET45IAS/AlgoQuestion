package P7;

public class Q2 {
    public static void pD(int[] a) {
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (isDuplicate) {
                    System.out.println(a[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {4,52,5792,644,57,57,63,372,2,4,52};
        pD(a);
    }    
}

