import enums.Payment;
public class Student extends Person {
public Payment payment;

    public Student(String FIO, int age, String gender) {
        super(FIO, age, gender);
    }

    @Override
    public String toString() {
        return "\nStudent" +
                "\nFIO: " + FIO +
                "\nAge: " + age +
                "\nGender: " + gender;
    }
}

