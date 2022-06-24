package basics;
import java.io.*;
public class DriverForFileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\naven\\Desktop\\FileDemo\\Demo.txt");
        boolean status = f.exists();
        if (status == false) {
            System.out.println("File is not exists");
        } else {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String words[] = null;
            int count = 0;
            String line = "";
            String oldline = "";
            int linecount = 0;
            while ((line = br.readLine()) != null) {
                oldline += line + "\r\n";
            }
            String replacedText  = oldline.replaceAll("hello", "" + "Java Programming");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(replacedText);
            bw.close();
        }
    }
}
