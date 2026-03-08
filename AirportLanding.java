import java.util.Scanner;

public class AirportLanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            String[] flightIDs = new String[n];
            int[] priorities = new int[n];

            for (int i = 0; i < n; i++) {
                flightIDs[i] = sc.next();
                priorities[i] = sc.nextInt();
            }

            System.out.println("Landing order:");

            for (int p = 1; p <= 3; p++) {
                for (int i = 0; i < n; i++) {
                    if (priorities[i] == p) {
                        System.out.print(flightIDs[i] + " ");
                    }
                }
            }
        }
        sc.close();
    }
}