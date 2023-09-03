package Seminar1;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int res = findValue(numbers, 1);

        System.out.println(res);

        System.out.println(Integer.parseInt("1240"));
    }

    public static int findValue(int[] arr, int value) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }
}