/*
private pin;
public void change_pin(int old,int new)
{
    if(int new == old)
    {
        System.out.println("PIN entered is correct"+pin);
        System.out.print("Enter new pin: ");
        int set = sc.nextInt();
        int set = new old();
    }
    else
    {
        System.out.print("PIN entered is incorrect: "+pin);
    }
}
*/
import java.util.Scanner;

public class ATM {

    private int _pin;

    public ATM(int initialPin) {
        _pin = initialPin;
    }

    public void changePin(int oldPin, int newPin) {
        if (_pin == oldPin) {
            _pin = newPin;
            System.out.println("PIN successfully updated.");
        } else {
            System.out.println("Incorrect old PIN. Cannot update.");
        }
    }

    public void displayPin() {
        System.out.println("Current PIN: " + _pin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM myATM = new ATM(1234);
        

        myATM.displayPin();

        System.out.print("Enter your old PIN: ");
        int oldPin = sc.nextInt();

        System.out.print("Enter your new PIN: ");
        int newPin = sc.nextInt();

        myATM.changePin(oldPin, newPin);

        myATM.displayPin();

        sc.close();
    }
}