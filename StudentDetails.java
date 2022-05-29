public class StudentDetails {
    private int rollNo;
    private int age;
    private String name;
    private String gender;
    private String department;
    private String emailId;
    private long phoneNo;

    public StudentDetails(int rollNo, int age, String name, String gender, String department, String emailId, long phoneNo) {
        this.age = age;
        this.rollNo = rollNo;
        this.department = department;
        this.emailId = emailId;
        this.gender = gender;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}


