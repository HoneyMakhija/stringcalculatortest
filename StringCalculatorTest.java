package Start;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringCalculatorTest {
	
 @Test
public static void sumEmptyStringto0() {
	
	assertThat(StringCalculator.sum(""), is(0));
}

}
