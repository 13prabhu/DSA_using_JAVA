public class functionOverloading {

    //  ++++++++++++++++++++++++function Overloading using paramters++++++++++++++++++++++++++++++++++++++


    // public static int sum(int a ,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }


    // ++++++++++++++++++++++++++++function overloading using data types ++++++++++++++++++++++++++++++++++

    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
    //    System.out.println(sum(2,5)); 
    //     System.out.println(sum(2,5, 8));

    // using data types

    System.out.println(sum(5,2));
    System.out.println(sum(1.2f,2.2f));

    }
}
