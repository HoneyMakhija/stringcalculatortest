package Start;
public class StringCalculator {
public static int sum(String numbers) {
	if(numbers.isEmpty())
	{
		return 0;
	}
	else if(numbers.contains(",")) {
		String[] n=numbers.split(",");
		return (Integer.parseInt(n[0])+Integer.parseInt(n[1]));
	}
	else
		return Integer.parseInt(numbers);
	
}  
}
