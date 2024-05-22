package BasicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
        BufferedReader bf =  new BufferedReader(inputStreamReader); // bf is resource so we should close it after using

//        try {
//            System.out.println("enter a number");
//            int a = Integer.parseInt(bf.readLine());
//            System.out.println("value of a from terminal is "+ a);
//            bf.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // better way is to use Scanner class
        System.out.println("Enter new number");
        Scanner scanner = new Scanner(System.in);

        int b =  scanner.nextInt();
        System.out.println("value of b using Scanner class is "+ b);

    }
}
