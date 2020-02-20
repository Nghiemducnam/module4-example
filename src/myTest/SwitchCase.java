package myTest;

import java.util.Scanner;

public class SwitchCase {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter your number here");
////        int number = sc.nextInt();
////        checkDay(number);
////    }
////
////    public static  void checkDay(int input){
////        switch (input){
////            case 2:
////                System.out.println("Monday");
////                break;
////            case 3:
////                System.out.println("Tuesday");
////                break;
////            case 4:
////                System.out.println("Wednesday");
////                break;
////            case 5:
////                System.out.println("Thursday");
////                break;
////            case 6:
////                System.out.println("friday");
////                break;
////            case 7:
////                System.out.println("saturday");
////                break;
////            case 8:
////                System.out.println("sunday");
////                break;
////            default:
////                System.out.println("The number is wrong");
////        }
////    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your word");
        String word = sc.nextLine();
        checkDay(word);
    }

    static void checkDay(String day){
        switch (day){
            case "Monday":
                System.out.println("Thứ 2");
                break;
            case "Tuesday":
                System.out.println("Thứ 3");
                break;
            default:
                System.out.println("the word is wrong");
        }

    }
}