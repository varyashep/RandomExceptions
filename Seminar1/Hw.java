package Seminar1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Hw {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = callMethod1();
        int a=10, b=1;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static ArrayList<String> callMethod1() throws IOException {
        callMethod2(100000000, 1);
        return new ArrayList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = new FileInputStream("C:\\Users\\varya\\Desktop\\GB\\ExceptionsJava\\Seminar1\\1.txt");
        fis.read();

        if(fis.available() > 0) throw new RuntimeException();
        int num = callMethod4("124O");
        return a/b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        int int_s = -1;
        try {
            int_s = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
        return int_s;
    }

    private static void callMethod5(String s) {
        try {
            callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i < strings.length; i++){
            strings[i] = s;
        }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
    }
}