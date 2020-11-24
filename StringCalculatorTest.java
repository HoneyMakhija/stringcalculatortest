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
@Test
public  void sumNumbersSeparatedByComma() {
	assertThat(StringCalculator.sum("1,2"), is(3));
	assertThat(StringCalculator.sum("2,4"), is(6));
	assertThat(StringCalculator.sum("1,2,4"), is(7));
	
}
@Test
public  void sumNumbersSeparatedByNewLine() {
	assertThat(StringCalculator.sum("1\n2"), is(3));
	assertThat(StringCalculator.sum("2\n4"), is(6));
}
@Test
public  void sumNumbersSeparatedByNewLineOrcomma() {
	assertThat(StringCalculator.sum("1\n2,3"), is(6));
	
}


}
