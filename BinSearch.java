import java.util.Scanner;

public class BinSearch {

    // Function to perform binary search (returns index or insertion point)
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        // Return the insertion point if not found
        return left;
    }

    public static void main(String[] args) {
        // We use a hardcoded sorted list for simplicity
        int[] sortedList = {1, 3, 5, 6, 9, 12, 15};
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Show the list to the user
        System.out.print("Current List: [");
        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + (i < sortedList.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // 2. Ask for the target value
        System.out.print("Enter the target number to search for: ");
        int target = scanner.nextInt();

        // 3. Perform the search
        int resultIndex = searchInsert(sortedList, target);

        // 4. Display the result
        if (resultIndex < sortedList.length && sortedList[resultIndex] == target) {
            System.out.println("Target found at index: " + resultIndex);
        } else {
            System.out.println("Target not found. It would be inserted at index: " + resultIndex);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}