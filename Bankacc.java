import java.util.Scanner;
class Bankacc
{
    private int balance;
    public Bankacc(int inibal)
    {
        this.balance = inibal;
    }
    public void dep(int amt)
    {
        if(amt>0)
        {
            balance += amt;
        }
    }
    public void with(int amt)
    {
        if(amt<= balance)
        {
            balance -= amt;
        }
        else
        {
            System.out.println("Balance insufficient !!Garib !!");
        }
    }
    public void getbal()
    {
        System.out.println("Your balance is "+balance);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int inibal = sc.nextInt();
        Bankacc myAcc = new Bankacc(inibal);

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            String op = sc.next();
            int amt = sc.nextInt();

            if(op.equalsIgnoreCase("Deposit"))
            {
                myAcc.dep(amt);
            }
            else if(op.equalsIgnoreCase("Withdraw"))
            {
                myAcc.with(amt);
            }
        }
        myAcc.getbal(balance);
    }
}