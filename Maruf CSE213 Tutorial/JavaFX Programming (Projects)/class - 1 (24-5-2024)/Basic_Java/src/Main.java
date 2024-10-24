import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        // java type casting
        // Automatically : smaller type to large type
        // byte->short->char->int->long->float->double
        int integerValue = 10;
        System.out.println(integerValue);
        double doubleValue = integerValue;
        System.out.println(doubleValue
        );





        // Manually: large type to smaller type
        // double->float->long->int->char->short->byte

        double doublevalue = 10.10;
        int integervalue = (int) doublevalue;
        System.out.println(integervalue);

        //java operator
        // Arithmetic operator +,-,*,/,%,++,--

        int a = 10;
        a+=5; //a = a+5
        System.out.println(a);

        a--;
        System.out.println(a); // 14

        // Assignment operators  =,+=,-=,

        // Comparison Operators <,>,!=,==,>=,<= out: boolean
        int x = 100;
        int y = 100;
        int z  = 101;
        System.out.println(x==y); //ture
        System.out.println(y==z);// false
        //System.out.println(x==y==z); that's why we invented logical operator

        // Logical Operators and(&&), or(||), not(!)
        System.out.println(x==y || y==z); //true
        System.out.println(x==y && y==z); //false
        System.out.println(x==y && y!=z); //ture




        // String

        String str = "Hi! I am string";

        // to show the total length of the string
        System.out.println(str.length()); //0-14=15

        // to show the index of the specific word or character

        System.out.println(str.indexOf("string")); // 8

        System.out.println(str.indexOf("st"));
        System.out.println(str.indexOf('s'));

        String txt  = "Hi! I am 'string' ";
        System.out.println(txt.indexOf("s")); // 10

        // Concatenation

        String fname = "Md";
        String lname= "x";

        System.out.println(fname+lname);
        System.out.println(fname.concat(lname));

        int ax  = 1;
        String bx = " = one";
        char cx = '#';
        System.out.println(ax+bx+cx);

       String xx = "0";
        char xxx = '0'; // asci value 48

        System.out.println(ax+xx); //10
        System.out.println(ax+xxx); //49


        // special character

        // output it's rainy day
        String output = "it's rainy day";
        // we love "java"
        String out = "we love \"java\"";
        System.out.println(output+"\n"+out);

        // Ture \ False

        String decission  = "True \\ False";
        System.out.println(decission.toUpperCase());
        System.out.println(decission.toUpperCase());

        int n = 1; //1
        String ns = Integer.toString(n); //"1"
        int nsi = Integer.parseInt(ns); //1
        double dn = n; //1.0
        String dnn = Double.toString(dn); //"1.0"
        //double dnnd = String.valueOf(dnn);
        double dnnd  =  Double.parseDouble(dnn);//1.0

        System.out.println();
        System.out.println(ns);
        System.out.println(((Object) n).getClass().getName()); // rest
        System.out.println(ns.getClass().getName());

        // java math
        int h  = 10;
        int w = 20;
        int g  = -10;
        int hwmax = Math.max(h,w); // 20
        int hwmin  = Math.min(h,w); //10
        int gabs = Math.abs(g);

        // random
        System.out.println(Math.random()); //[0.0,1.0]

        int rnum = (int) (Math.random()*10)-3;// [1,7]
        System.out.println(rnum);


        System.out.println(h>w);

        // java conditions and if statement

        if (h>w){
            System.out.println("h is gater then w");
        }else if(g>h || g>w){
            System.out.println("g is gater then both h and w");
        }
        else{

        System.out.println("w is gater then h");
        }

        // switch
        //rnum which generated a random vlaue

        if (rnum<=7){
            switch (rnum){
                case 1:
                    System.out.println("sday");
                    break;
                case 2:
                    System.out.println("sunday");
                    break;
                case 3:
                    System.out.println("mday");
                    break;
                case 4:
                    System.out.println("tday");
                    break;
                case 5:
                    System.out.println("wday");
                    break;
                case 6:
                    System.out.println("thday");
                    break;
                default:
                    System.out.println("fday");
                    break;
            }

        }
        else{
            System.out.println("Input is Invalid");
            }
*/
        // for, while loops, for each loop, do while loop
        // for i in range(), for i in obejct

        // Syntax: while (condition){ block of code (increment or decrement )}

/*
        // print 1 to 100
        int i=100;
        while (i>=0){   //i<0
            System.out.print((100-i)+" "); // 0 1 2 3 4 5 6 ..... //0123456
            i--;


        }


        // syntax: do{increment or decrement}while(condition)
        // print 0 4
        System.out.println("\n");
        int j = 0; // 0
        do{
            System.out.println(j);
            j++; // j=j+1
        }while(j<5);

    // syntax : for(statement1,statement2, statement3){}
        // statement1 : initialize the value
        // statement2: condition
        // statement3: increment or decrement

        for (int z=0; z<100;z=z+3){
            System.out.println(z);
        }
        // outer
        for(int x = 0; x<=3;x++){ //0,1,3
            System.out.println(x);
            // inner loop
            for(int m = 0; m<=4; m++){ //01234,01234,01234
                System.out.println(m);
            }

        }

        //


*/

        // syntax: for(type veriableName: object){}

       /* String [] lst = {"A", "B","C","D"};
        for (String l: lst){
            System.out.println(l);
        }


        // step1: Array declare

        int [] numbers;

        //step 2 : Initialize
        numbers = new int[5];

        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
       //numbers[5]=6; error: index out of bound

        for(int b=0; b<numbers.length; b++){
            System.out.println(numbers[b]);
        }

        for (int n: numbers){
            System.out.println(n);
        }

        // iterate using while and do while
        System.out.println(numbers[6]);

        //2d array: declare + initialize

        int[][] matrix = new int[3][3];
        matrix [0][0] = 1;

 */
        int [] array = {1,2,3,4,5,0};
       // System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}