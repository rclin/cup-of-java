
import junit.framework.TestCase;
import org.easymock.EasyMock;
import java.io.IOException;

public class CurrencyTest extends TestCase {

    public void testToEuros() throws IOException {

        System.out.println("testing testToEuros!");

        Currency testObject = new Currency(2.50, "USD");
        Currency expected = new Currency(3.75, "EUR");
        ExchangeRate mock = EasyMock.createMock(ExchangeRate.class);
        EasyMock.expect(mock.getRate("USD", "EUR")).andReturn(1.5);
        EasyMock.replay(mock);
        Currency actual = testObject.toEuros(mock);
        assertEquals(expected, actual);
    }

}