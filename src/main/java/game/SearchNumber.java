package game;

import java.util.Scanner;

/**
 * Created by vdruzhinin on 4/14/2017.
 */
public class SearchNumber {

    public static void gameNumber(int min, int max) {

        int findNum = (max + min) / 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Это число: " + findNum + "?");

        boolean key;
        key = scanner.nextBoolean();

        if (key) {
            System.out.println("Ваше число: " + findNum);
        } else {
            System.out.println("Это число больше " + findNum + " ?");
            key = scanner.nextBoolean();
            if (key) {
                min = findNum;
                gameNumber(min, max);
            } else {
                    max = findNum;
                    gameNumber(min, max);
            }
        }
    }
}
