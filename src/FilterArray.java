import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by pc on 4/1/2016.
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[]words = console.nextLine().split("\\s+");

        Arrays.stream(words)
                .filter(w -> w.length() > 3)
                .forEach(w -> System.out.printf("%s ", w));
    }
}
