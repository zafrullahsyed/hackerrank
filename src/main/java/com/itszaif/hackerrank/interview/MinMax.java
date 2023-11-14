import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//426980153 354802167 142980735 968217435 734892650
public class Minmax {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Long> naturalOrder = integerList.stream().sorted(Comparator.naturalOrder()).map(Integer::longValue).toList();

        List<Long> reverseOrder = integerList.stream().sorted(Comparator.reverseOrder()).map(Integer::longValue).toList();

        long lowValue = reverseOrder.stream().skip(1).reduce(0L, Long::sum);

        long highValue = naturalOrder.stream().skip(1).reduce(0L, Long::sum);

        System.out.println(lowValue + " " + highValue);

        bufferedReader.close();
    }
}
