import java.time.LocalDate;

public class Student {
    String name,id;
    double cgpa;
    final LocalDate dob= LocalDate.now();

    // They are two type of constructor 1. default constructor 2. parametarized constructor


    public Student() {
    }

    public Student(String name, String id, double cgpa, LocalDate dob) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        dob = dob;
    }

    void diplay_information(String name, String id, double cgpa, LocalDate dob){

        System.out.println("Student name: "+ name);
        System.out.println("Student Id: "+id);
        System.out.println("Student cgpa: "+cgpa);
        System.out.println("Student date Of birth: "+dob);
        f u  = new f();
        System.out.println("University name is: "+ u.university_name);




    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cgpa=" + cgpa +
                ", dob=" + dob +
                '}';
    }

    void diplay_information(){
        System.out.println("Student name: "+ name);
        System.out.println("Student Id: "+id);
        System.out.println("Student cgpa: "+cgpa);
        System.out.println("Student date Of birth: "+dob);
        f u  = new f();// create object of f class
        System.out.println("University name is: "+ u.university_name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDob() {
        return dob;
    }
}
