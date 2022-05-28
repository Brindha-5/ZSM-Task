package Father;

 public class Father {
    public void displaypublic()
    {
        System.out.println("Hi... im public");
    }
    protected void displayProdected()
    {
        System.out.println("Hi... im prodected");
    }
    void displaydefault()
    {
        System.out.println("Hi im default");
    }
    private void Displayprivate()
    {
        System.out.println("Hi im Private");
    }
}
class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        f.displaydefault();
        f.displayProdected();
        f.displaypublic();
    }
}

    class Daughter
    {
        public static void main(String[] args) {
            Father f=new Father();
            f.displayProdected();
            f.displaypublic();
            f.displaydefault();
        }
    }


