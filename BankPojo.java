package tuesday_12;

public class BankPojo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getPassword() {
        return password;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private long accno;
    private String password;
    private double amt;
    private String phonenumber;

    public BankPojo(String name, long accno, String password, double amt,String phonenumber) {
        this.name = name;
        this.accno = accno;
        this.password = password;
        this.amt = amt;
        this.phonenumber=phonenumber;
    }
}
