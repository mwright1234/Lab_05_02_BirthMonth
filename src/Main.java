import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("please enter your birth month using an integer 1-12:");

        birthMonth = in.nextInt();

        if (birthMonth > 0 && birthMonth < 13) {
            System.out.print("your birth month via integer:" + birthMonth);
        } else {
            System.out.print("you did not enter an integer from 1-12");
        }
    }
}