package tuesday_12;

import java.util.ArrayList;
import java.util.Scanner;

public class BankDetails {
    static ArrayList<BankPojo> bank=new ArrayList<>();
    Scanner ip=new Scanner(System.in);
    void addUser()
    {
        bank.add(new BankPojo("Brindha",100,"brindha",1000,"7478976543"));
        bank.add(new BankPojo("Anitha",101,"anitha",2000,"9876543212"));
        bank.add(new BankPojo("Agalya",102,"agalya",3000,"8765432123"));
        bank.add(new BankPojo("Ramya",103,"ramya",4000,"7654321234"));
        bank.add(new BankPojo("Babu",104,"babu",5000,"6543212345"));
        bank.add(new BankPojo("Admin",000,"admin",5000,"9876543212"));

    }
    void addNewUser()
    {
        String name,password;
        long accno;
        double amt;

        System.out.println("Enter the name");
        name=ip.nextLine();
        System.out.println("Enter the accountnumber");
        accno=ip.nextLong();
        ip.nextLine();
        System.out.println("Enter the password");
        password=ip.nextLine();
        System.out.println("Enter the amount");
        amt=ip.nextDouble();
        ip.nextLine();
        System.out.println("Enter phone number");
        String ph=ip.nextLine();
        bank.add(new BankPojo(name,accno,password,amt,ph));
        System.out.println("You are successfully signed up");
    }
    void display() {
        while (true) {
        System.out.println("Enter your Choice");
        System.out.println("1.Signup");
        System.out.println("2.LogIn as a Admin");
        System.out.println("3.LogIn as a customer");
        System.out.println("4.Exit");
        int choice = ip.nextInt();
        ip.nextLine();

            switch (choice) {
                case 1:
                    addNewUser();
                    break;
                case 2:
                    adminLogin();
                    break;
                case 4:
                    System.exit(0);
                case 3:
                    userLogin();
                    break;
            }

        }
    }
    void userLogin() {
        System.out.println("Enter your Account number");
        long accno = ip.nextLong();
        ip.nextLine();
        System.out.println("Enter your Password");
        String pw = ip.nextLine();
        int count = 0;
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getAccno() == accno && bank.get(i).getPassword().equals(pw)) {
                count = 1;
                System.out.println("You have logged in successfully");
                while (true) {
                System.out.println("Enter your choice");
                System.out.println("1.Deposit Amount");
                System.out.println("2.Withdraw Amount");
                System.out.println("3.View your Account balance");
                int ch = ip.nextInt();

                    switch (ch) {
                        case 1:
                            toDeposit(i);
                            break;
                        case 2:
                            toWithdraw(i);
                            break;
                        case 3:
                            toViewBalance(i);
                            break;
                        case 4:
                            System.exit(0);
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Pease check your Accno and Password");
        }
    }
    void toDeposit(int x)
    {
        System.out.println("Enter the amount to Deposit");
        double amt=ip.nextDouble();
        double new_amt=bank.get(x).getAmt()+amt;
        bank.get(x).setAmt(new_amt);
        System.out.println("Your amount deposited successfully,Now your account balance is"+new_amt);
    }
    void toWithdraw(int x)
    {
        System.out.println("Enter the amount to withdraw");
        double amt=ip.nextDouble();
        if(bank.get(x).getAmt()>amt)
        {
            double new_amt=bank.get(x).getAmt()-amt;
            bank.get(x).setAmt(new_amt);
            System.out.println("Your amount withdrawn successfully,Now your account balance is"+new_amt);
        }
else {
    System.out.println("Insufficient amount to withdraw");
        }
    }
    void toViewBalance(int x)
    {
        System.out.println("Your available balance is"+bank.get(x).getAmt());

    }
void adminLogin()
{
    System.out.println("Enter Admin Id");
    long n=ip.nextLong();
    ip.nextLine();
    System.out.println("Enter password");
    String pw=ip.nextLine();
    if(n==000&&pw.equals(pw))
    {
        boolean flag=true;
        while(flag) {
            System.out.println("Enter your choice");
            System.out.println("1.To view All users Details");
            System.out.println("2.To view Particular user detail");
            System.out.println("3.To Remove Particular user");
            System.out.println("4.exit");
            int ch=ip.nextInt();
            switch(ch)
            {
                case 1:
                    toViewAllusers();
                    break;
                case 2:
                    toViewPariticularUser();
                    break;
                case 3:
                    toRemoveParticularUser();
                    break;
                case 4:
                    flag=false;
                    break;
            }
        }
    }
    else {
        System.out.println("Please check Id and Password");
    }

}
void toViewAllusers()
{
    System.out.println("Name     AccNo        Amount        Phonenumber");
    System.out.println("____________________________________________________");
    for(int i=0;i<bank.size();i++)
    {
        System.out.println(bank.get(i).getName()+"   "+bank.get(i).getAccno()+"     "+bank.get(i).getAmt()+"    "+bank.get(i).getPhonenumber());
    }
    System.out.println("______________________________________________________ ");

}
void toViewPariticularUser()
{
    System.out.println("Enter Account Number");
    long ac_no=ip.nextLong();
    int count=0;
    System.out.println("Name     AccNo        Amount        Phonenumber");
    System.out.println("____________________________________________________");
    for(int i=0;i<bank.size();i++)
    {
        if(bank.get(i).getAccno()==ac_no)
        {
            count=1;
            System.out.println(bank.get(i).getName()+"   "+bank.get(i).getAccno()+"     "+bank.get(i).getAmt()+"    "+bank.get(i).getPhonenumber());
        }
        System.out.println("______________________________________________________ ");
    }
    if(count==0)
    {
        System.out.println("Account Number Not Found");
    }
}
void toRemoveParticularUser()
{
    System.out.println("Enter Account Number");
        long ac_no=ip.nextLong();
        int count=0;
        for(int i=0;i<bank.size();i++)
        {
            if(bank.get(i).getAccno()==ac_no) {
                count = 1;
                bank.remove(i);
                System.out.println("Successsfully Removed");
            }
        }
        if(count==0)
        {
            System.out.println("Account Number Not found");
        }
}
    public static void main(String[] args) {
        BankDetails b=new BankDetails();
        b.addUser();
       b.display();
    }
}
