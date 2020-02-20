package myTest;

import java.util.Scanner;

public class CheckException {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int e = sc.nextInt();
        try {
            System.out.println("The Area is " + area(d, e));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("It's Okay");

    }

    static int area(int a, int b) throws MyException {


            if (a < 0 || b < 0) {
                throw new MyException("Breadth and height must be positive");
            } else if( b == 0) {
                throw new MyException("Can't device by zero");
            }else{
                return a/b;
            }
        }

}