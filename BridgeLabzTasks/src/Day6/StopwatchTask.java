package Day6;

import java.util.Scanner;

public class StopwatchTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to START the stopwatch");
        sc.nextLine();   // wait for start click
        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to STOP the stopwatch");
        sc.nextLine();   // wait for end click
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        sc.close();
    }
}
