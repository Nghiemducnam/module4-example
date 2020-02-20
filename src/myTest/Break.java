package myTest;

public class Break {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5};
        for (int value : arr) {
            System.out.println(value);
            if (value == 2) {
                break;
            }
        }
    }
}