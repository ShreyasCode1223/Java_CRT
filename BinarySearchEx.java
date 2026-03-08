import java.util.Scanner;
import java.util.*;

public class BinarySearchEx
{
    public static int BinarySearch(int[] arr, int key)
    {
        int high = arr.length -1;
        int low = 0;

        while (low <= high)
        {
            int mid = low + (high-low)/2;

            if(arr[mid] == key)
            {
                return mid; 
            }
            else if(arr[mid] > key)
            {
                high = mid-1;
            }
            else
            {
                low = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {3, 5, 9, 12, 17, 23, 30}
        int key = 17;
    }
}