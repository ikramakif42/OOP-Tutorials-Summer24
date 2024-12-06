import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**Student abbas = new Student("Abbas","2221086",3.9, LocalDate.of(2000,10,25)); // Create obeject of Student class
        //String name, String id, float cgpa, LocalDate dob
        //abbas.diplay_information("Abbas","2221086",3.9, LocalDate.of(2000,10,25));
        abbas.diplay_information();**/

        // Create an instance of the OuterClass
        OuterClass outer = new OuterClass();
        outer.createInnerClassInstance();

        Student[]  array = new Student[5];
        Student abbas = new Student("Abbas","2221086",3.9, LocalDate.of(2000,10,25));
        Student ratna = new Student("Ratna","2221087",3.8, LocalDate.of(2001,10,25));
        Student lopa = new Student("Lopa","2221088",3.95, LocalDate.of(2002,10,25));

        array[0]=abbas;
        array[1]=ratna;
        array[2]=lopa;


        System.out.println(array[1].getCgpa());

        System.out.println(ratna.toString());


        Child ch = new Child();
        ch.ddisplay();

        // Access Modifire: default, public, private, protected









    }
}
