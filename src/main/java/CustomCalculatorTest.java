import org.junit.Test;

import static java.util.concurrent.CompletableFuture.anyOf;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void 더하기테스트(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void 마이너스테스트() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10, 2);
        assertTrue(result == 8);
    }

    @Test
    public void 곱하기테스트() {
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10,2);
        assertTrue(result == 20);
    }

    @Test
    public void 나누기테스트() {
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,2);
        assertTrue(result == 5);
    }


}