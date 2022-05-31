import java.io.*;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File create=new File("NewFile.txt");
        create.createNewFile();
        System.out.println("Newfile Created , File Name: "+create.getName());
        FileWriter writer=new FileWriter("NewFile.txt");
        writer.write("This is my file");
        writer.close();
        System.out.println("Successfully written");
        FileReader fr=new FileReader("NewFile.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        int count=0;
        while((line=br.readLine())!=null)
        {
            String word[]=line.split(" ");
            count=count+word.length;
        }
        System.out.println("No of words in the file is:"+count);
    }
}
