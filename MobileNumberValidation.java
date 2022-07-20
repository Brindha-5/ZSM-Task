package tuesday_12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    void display()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mob=ip.nextLine();
        Pattern p= Pattern.compile("[0-9]{10}");
        Matcher m=p.matcher(mob);
      if(m.matches())
      {
          System.out.println(m.group()+"Valid");
      }
      else
      {
          System.out.println("Not a valid");
      }
    }

    public static void main(String[] args) {
        MobileNumberValidation m=new MobileNumberValidation();
        m.display();
    }
}
