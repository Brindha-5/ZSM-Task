import java.util.*;

class InsertionSort {
    void getData() {
        String name;
        int id, n;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        n = ip.nextInt();
        StudentPojo1 student[] = new StudentPojo1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Id of the Student");
            id = ip.nextInt();
            ip.nextLine();
            System.out.println("Enter the Name of the Student");
            name = ip.nextLine();
            student[i] = new StudentPojo1(name, id);
        }
        System.out.println("Before Sorting");
        for (StudentPojo1 s : student) {
            System.out.println(s);
        }
        int j = 0;
        for (int i = 1; i < student.length; i++) {
            StudentPojo1 temp = student[i];
            j = i;
            while ((j > 0) && (student[j - 1].getId() > (temp.getId()))) {
                student[j] = student[j - 1];
                j--;
            }
            student[j] = temp;
        }
        System.out.println("After Sorting");
        for (StudentPojo1 s : student) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        InsertionSort n = new InsertionSort();
        n.getData();
    }

}


