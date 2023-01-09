import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Mentor jojo=new Mentor("Jotaro Kujo",28,"male");
        System.out.println(jojo.toString() +"\n"+ jojo.degree.SENIOR+"\n"+jojo.pl.PYTHON);
        Mentor joseph=new Mentor("Joseph Joestar",18,"male");
        System.out.println(joseph.toString() +"\n"+ joseph.degree.MIDDLE+"\n"+joseph.pl.JAVASCRIPT);
        Mentor jolyne=new Mentor("Jolyne Kujo",20,"female");
        System.out.println(jolyne.toString()+"\n" + jolyne.degree.SENIOR+"\n"+jolyne.pl.JAVA);


        Student ermes=new Student("Ermes Costello",22,"female");
        System.out.println(ermes.toString()+"\n"+ermes.payment.FREE+"\n"+ermes.pl.JAVA);
        Student weather=new Student("Weather Report",25,"male");
        System.out.println(weather.toString()+"\n"+weather.payment.PAYED+"\n"+weather.pl.JAVASCRIPT);
        Student goo=new Student("Goo Goo Dolls",29,"female");
        System.out.println(ermes.toString()+"\n"+goo.payment.NOTPAYED+"\n"+goo.pl.PYTHON);


    }
}