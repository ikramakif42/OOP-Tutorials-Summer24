//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /* how to define a function in a python
    def sum(a,b):
       return a+b
    print(sum(20,30))
     */
    // function components in java  {access_modifire return_type method_name
    public int sum(int a , int b){
        int result = a+b;
        return result;
        //System.out.println(result);

    }

    public void print_(String class_name){
        System.out.println("This is a "+class_name);
    }


    public static void main(String[] args) {
        // To create object of any class :

        Main m = new Main(); // m is a instance/object of Main class

        int result = m.sum(20,30);
        System.out.println(result);

        m.print_("Tutorial Class");


        // for loop syntax: for (statement1, statement2(always true or falas), statement3){}

        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        // for each loop

        int arr[] = {10,20,30,40,45};

        for (int i : arr){
            System.out.println(i);
        }

        // while loop : 2 types do-while another one is while

        int i =0;

        while (i<10){
            System.out.println(i);
            i++;


            // do while
            int b = 5;
            do{
                System.out.println(b);
                b++;
            }while(b<10);
        }




        }


    }
