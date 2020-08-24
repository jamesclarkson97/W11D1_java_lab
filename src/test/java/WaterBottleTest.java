import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void checkVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeByTen() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyWaterBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillWaterBottle() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}
