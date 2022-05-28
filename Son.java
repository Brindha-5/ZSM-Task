package Son;
import Father.Father;

public class Son extends Father {
    public static void main(String[] args) {
        Father f =new Father();
        f.dispalyprotected();

        f.displaypublic();
    }
}
