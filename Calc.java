import java.util.Scanner;

class Calc{
    public static void main(String [] args){


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