package understanding_object_class_pack;

public class Car_Demo {

    //Attributes / Field
    private String color;
    private String type;
    private int modelNumber;
    private int year;


    public Car_Demo() { // Default constructor
    }

    public Car_Demo(String color, String type, int modelNumber, int year) {
        this.color = color;
        this.type = type;
        this.modelNumber = modelNumber;
        this.year = year;
    }

    // Methods // Behaviour
    public void start() {
        System.out.println(modelNumber + " is starting.");
    }

    public void stop() {
        System.out.println(modelNumber + " is stopping.");
    }
}
