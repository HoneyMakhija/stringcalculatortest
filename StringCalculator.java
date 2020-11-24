package Start;
import java.util.stream.Stream;
import java.util.Arrays;
public class StringCalculator {
public static int sum(String numbers) {
	if(numbers.isEmpty())
	
		return 0;
	
	 Stream<String> n=Arrays.stream(numbers.split(",|\n"));
	 return n.mapToInt(Integer::parseInt).sum();
}

}
