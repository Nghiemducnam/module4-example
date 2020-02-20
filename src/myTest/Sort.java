package myTest;

import java.util.Scanner;

public class Sort {
    static void inputIndexOfArr(int [] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the index of array bellow: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr[" +i+ "]");
            arr[i] = scanner.nextInt();
        }
    }

    static void exportArray(int [] arr){
        for(int j = 0; j< arr.length; j++){
            System.out.println("arr[" +j+ "] = " + arr[j]);
        }

    }

    static void permute(int [] arr, int a, int b){
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }

    static void sort(int [] arr, int length){
        for(int k =0; k < length-1; k++){
            for(int n =k+1; n < length; n++){
                if(arr[k]< arr[n]){
                    permute(arr, k , n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr;
        System.out.println("enter the index of array here: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
         arr = new int[length];
        inputIndexOfArr(arr);
        System.out.println("the array after sorted:");
        sort(arr, length);
        exportArray(arr);
    }
    }