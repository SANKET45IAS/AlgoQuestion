package AAAAAAAAAA;

import java.util.Scanner;

public class MaxFreq {
    public static int findMaxFrequencyElement(int[] arr, int n)
    {
        int maxFrequency = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j])
                    count++;

            if (count>maxFrequency)
            {
                maxFrequency = count;
                maxElement = arr[i];
            }
        }

        return maxElement;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("Elements which appears maximum number of times in the array is "+findMaxFrequencyElement(arr,n));
    }
}

