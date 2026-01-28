import java.util.Arrays;
public class Array1 {
    public static void main(String args[]) {
        int[] arr = {50, 40, 10, 30, 90};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr ,1,4,10);
        System.out.println("The index of key element is "+ index);
    }
}