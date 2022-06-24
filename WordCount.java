package basics;
import java.io.*;
public class WordCount {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\naven\\Desktop\\FileDemo\\Demo.txt");
        boolean status=f.exists();
        if(status==false)
        {
            System.out.println("File is not exists");
        }
        else
        {
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String words[]=null;
            int count=0;
            String line="";
            String input="java";
            int linecount=0;
            while((line=br.readLine())!=null)
            {
           words=line.split(" ");
           linecount++;
           for(String i:words)
           {
               if(i.equals(input))
               {
                   count++;
               }
           }
            }
if(count!=0)
{
    System.out.println("The word" + input +"present"+count+"times in file");
}
else {
    System.out.println("The word is not available");
}

        }

    }
}
