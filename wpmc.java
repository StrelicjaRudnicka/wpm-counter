import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class wpmc{

    static String[] words = {"shall", "example", "mint", "qualify", "attempt", "java", "program", "the", "worth"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("type!");

        Random randomize = new Random();
        for(int i = 0; i < 10; i++) {
            System.out.print(words[randomize.nextInt(9)] + " " );
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner check = new Scanner(System.in);
        String wordstyped = check.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double time = end - start;
        double seconds = time / 1000000000.0;
        int numc = wordstyped.length();
        int wpm = (int) ((((double) numc / 5) / seconds) * 60);
        System.out.println("Your current wpm is " + wpm + "!");
    }
}
