import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pc on 4/1/2016.
 */
public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[]numbers = console.nextLine().split("\\s+");
        String sortingOrder = console.nextLine();

        if (sortingOrder.equals("Ascending")){
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted()
                    .forEach(d -> System.out.printf("%d ", d));
        }else{
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted((d1, d2) ->d2.compareTo(d1))
                    .forEach(d -> System.out.printf("%d ", d));
        }

    }
}
