public class Student {

    int sno;
    String name;
    private static int temp = 1;

    public Student(String name) {
        this.name = name;
        this.sno = temp;
        temp++;
    }

    public void printStudentInfo() {
        System.out.println("번호: " + sno + " / " + "이름: " + name);
    }
}
