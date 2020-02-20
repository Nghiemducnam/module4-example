package myTest;
public class DoWhile {
    public static void main(String[] args) {
        int [] arr = new int []{9,2,6,4};
        export(arr);
    }

    public static void export(int [] arr){
        int i = 0;
        do{
            System.out.println("arr ["+i+"] = " + arr[i]);
            i++;
        }
        while (i<arr.length);
    }
}