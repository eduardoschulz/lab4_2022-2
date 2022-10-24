package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Io {
    static Scanner scan = new Scanner(System.in);
    public static int inputInt() {
        int recv = 0;
        try {
            recv = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.printf("\n Input Inválido! Precisa ser um Número\n%s", e.toString());
            return -1;
        }

        return recv;
    }
    public static int inputInt(String s) {
        int recv = 0;
        try {
            System.out.printf("%s", s);
            recv = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.printf("\n Input Inválido! Precisa ser um Número\n%s", e.toString());
            return -1;
        }

        return recv;
    }
    public static String inputString(String s) {
        String recv = "";
        try {
            System.out.printf("%s", s);
            recv = scan.nextLine();
        } catch (InputMismatchException e){
            System.out.printf("\n%s\n", e.toString());
            scan.next();
        }

        return recv;
    }
    public static String inputString() {
        String recv = "";
        try {
            recv = scan.nextLine();
        } catch (InputMismatchException e){
            System.out.printf("\n%s\n", e.toString());
            scan.next();
        }

        return recv;
    }
}
