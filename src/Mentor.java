import enums.Degree;

public class Mentor extends Person {

    public Degree degree;

    public Mentor(String FIO, int age, String gender) {
        super(FIO, age, gender);
    }

    @Override
    public String
    toString() {
        return "\nMentor" +
                "\nFIO: " + FIO +
                "\nAge: " + age +
                "\nGender: " + gender;
    }
}

