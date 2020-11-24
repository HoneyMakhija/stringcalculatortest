package Start;
import java.util.stream.Stream;
import java.util.Arrays;
public class StringCalculator {
public static int sum(String numbers)  {
	if(numbers.isEmpty())
	
		return 0;
	
	String delimiter=",|\n";
	if(numbers.startsWith("//")) {
	String[] i=numbers.split("\n",2);
		delimiter=i[0].substring(2);
		numbers=i[1];
		
	}
	if(numbers.startsWith("-")) {
		throw new IllegalArgumentException();
	}
	
	 Stream<String> n=Arrays.stream(numbers.split(delimiter));
	 return n.mapToInt(Integer::parseInt).sum();
}

}
