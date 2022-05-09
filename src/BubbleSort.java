
import java.util.Scanner;
public class BubbleSort {


    public static void bubbleSort(int[] arr, int n){
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void bubblePrint(int[] arr, int n) {
        for (int i=0; i< n; i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bubble Sort");
        System.out.println("Enter Lenght of array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter Array elements::");
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Before Sorting: ");
        bubblePrint(arr ,n);
        System.out.println();
        bubbleSort(arr,n);
        System.out.println("After sorting: ");
        bubblePrint(arr,n);
    }

}
