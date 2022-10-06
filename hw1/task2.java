package ; //insert name

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int secretCode;
        do {
            Scanner in = new Scanner(System.in);
            secretCode = in.nextInt();
            if (secretCode == 123) {
                System.out.println("Correct number!");
            } else {
                System.out.println("Incorrect number!");
            }

        } while (secretCode != 123);

    }
}
