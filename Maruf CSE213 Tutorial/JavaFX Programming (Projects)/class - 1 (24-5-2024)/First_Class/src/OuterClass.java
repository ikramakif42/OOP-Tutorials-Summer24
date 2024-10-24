public class OuterClass {
    private String outerField = "I am outerclass field";


    //No-static Inner class

    class InnerClass{
        void display(){
            // Inner class can access outer class member
            System.out.println("Accessing outer class filed: "+ outerField);
        }
    }

    void createInnerClassInstance(){
        // Creating an instance of the inner class
        InnerClass inner = new InnerClass();
        inner.display();

    }

}
//