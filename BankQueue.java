import java.util.Scanner;

public class BankQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        int[] queue = new int[n]; 
        int front = 0;
        int rear = 0;

        System.out.println("Enter customer IDs:");
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();

            queue[rear] = id;
            rear++;
        }

        System.out.print("Service order: ");
        while (front < rear) {
            System.out.print(queue[front] + " ");
            front++;
        }
        sc.close();
    }
}