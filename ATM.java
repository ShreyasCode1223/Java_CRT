//Object Oriented Programming

class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.out);
        int old = 1234;
        System.out.print("Enter the ATM PIN ");
        int pin = sc.nextInt();
        if(int pin == old)
        {
            System.out.print("PIN entered is correct"+pin);
            System.out.print("Enter new pin: ");
            int set = sc.nextInt();
            int set = new old();
            
        }
        else 
        {
            System.out.print("PIN entered is incorrect"+pin);
        }
    }
}