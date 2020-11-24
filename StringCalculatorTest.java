package Start;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StringCalculatorTest {
	@SuppressWarnings("deprecation")
 @Test
public  void sumEmptyStringto0() {
	
	assertThat(StringCalculator.sum(""), is(0));
}

@Test
 public  void SingleNumberReturnItself() {
	assertThat(StringCalculator.sum("1"), is(1));
	assertThat(StringCalculator.sum("2"), is(2));
}
}
