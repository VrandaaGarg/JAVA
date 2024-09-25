
public class J03_sumOfArrElements {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.printf("Sum of elements of array is %d", sum);
    }
}
