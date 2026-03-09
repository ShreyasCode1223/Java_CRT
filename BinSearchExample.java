import java.util.Scanner;
import java.util.*;

public class BinSearchExample
{
    public static binsearch(int target, int[] arr)
    {
        int n = arr.length;
        int right = n-1;
        int left = 0;
        
        while(right <= left)
        {
            int mid = left + (right - left)/2;
            if(arr[mid] == target)
            {
                return mid; 
            }
            else if(arr[mid] < target)
            {
                right = mid-1;
            }
            else
            {
                left = mid +1;
            } 
        }
    }
}