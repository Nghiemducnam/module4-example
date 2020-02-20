package myTest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int B = sc.nextInt();
            int H= sc.nextInt();
            if(B >0 && H >0){
                int area=B*H;
                System.out.print(area);
            }else if( B<0 || H<0) throw new Exception("Breadth and height must be positive");

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}