package myTest;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int [] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int length = sc.nextInt();
        arr = new int [length];
        inputArray(arr, length);
        exportArray(arr, length);
    }

    static void inputArray(int [] arr, int length){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE INDEX VALUE OF ARRAY");
        int i =0;
        while (i<length){
            arr[i] = sc.nextInt();
//            System.out.println("arr ["+ i +"] = " + arr[i]);
            i++;
        }
    }

    static void exportArray(int [] arr, int length){
        int j =0;
        while (j< length){
            System.out.println("arr ["+j+"] = " + arr[j]);
            j++;
        }
    }
}