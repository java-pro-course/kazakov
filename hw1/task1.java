package ;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int i = 1;
        int num = in.nextInt();
        while(i <=num)

        {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
    	}

    }
}
