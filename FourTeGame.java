import java.util.Scanner;

public class FourTeGame {
    void getInfo()
    {
        System.out.println("*******FOURTE********");
       try {
           Thread.sleep(3000);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       System.out.println("1.Start Game");
       System.out.println("2.Close");
       Scanner ip=new Scanner(System.in);
       int ch=ip.nextInt();
       switch(ch) {
           case 1:
               System.out.println("Enter Two Numbers(0 to 9)");
               int game_array[] = new int[2];
               for (int i = 0; i < 2; i++) {
                   game_array[i] = ip.nextInt();
               }
               System.out.println("Enter Target Number");
               int target = ip.nextInt();
               for (int i = 0; i<1; i++) {

                       if (game_array[i] +game_array[i+1]==target)
                       {
                           System.out.println(game_array[i]+" + "+game_array[i+1]+" = "+target);
                       }
                       else  if (game_array[i]-game_array[i+1]==target)
                       {
                           System.out.println(game_array[i]+" - "+game_array[i+1]+" = "+target);
                       }
                       else  if (game_array[i+1]-game_array[i]==target)
                       {
                           System.out.println(game_array[i+1]+" - "+game_array[i]+" = "+target);
                       }
                       else  if (game_array[i+1]*game_array[i]==target)
                       {
                           System.out.println(game_array[i+1]+" * "+game_array[i]+" = "+target);
                       }
                       else  if (game_array[i+1]/game_array[i]==target)
                       {
                           System.out.println(game_array[i+1]+" / "+game_array[i]+" = "+target);
                       }
                       else  if (game_array[i]/game_array[i+1]==target)
                       {
                           System.out.println(game_array[i]+" * "+game_array[i+1]+" = "+target);
                       }
                       else
                       {
                           System.out.println("Never Attained");
                       }

               }
               break;
           case 2:
               System.exit(0);
       }

    }

    public static void main(String[] args) {
        FourTeGame f=new FourTeGame();
        f.getInfo();
    }
}
