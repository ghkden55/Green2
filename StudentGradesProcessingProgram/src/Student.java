public class Student {

    int sno;
    String name;
    int age;
    String gender;

    public Student(int sno, String name, int age, String gender) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "sno: " + sno + " | " + "name: " + name + " | " + "age: " + age + " | " + "gender: " + gender;
    }
}
