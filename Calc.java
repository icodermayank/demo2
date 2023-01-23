import java.util.Scanner;

class Calc{
    public static void main(String [] args){
        System.out.println("Welcome to the command line calculator.");
        System.out.prinltn("Enter Your No.");

        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Press 1 for add\nPress 2 for substract\nPress 3 for Multiply\nPress 4 for divide");
       
        int c = s.nextInt();
        
        switch(c){
            case 1: System.out.println(add(a,b));
            break;
            case 2: System.out.println(sub(a,b));
            break;
            case 3: System.out.println(mul(a,b));
            break;
            case 4 : System.out.println(div(a,b));
            default : System.out.println("Invalid input please try again.");
        }

    }
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        try{
            int x = a/b;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }
}