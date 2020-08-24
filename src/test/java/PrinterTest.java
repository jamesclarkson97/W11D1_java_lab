import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 100);
    }

    @Test
    public void hasSheets() {
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void hasEnoughSheets() {
        assertEquals(true, printer.print(5, 2));
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void doesNotHaveEnoughSheets() {
        assertEquals(false, printer.print(10, 3));
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }
}
