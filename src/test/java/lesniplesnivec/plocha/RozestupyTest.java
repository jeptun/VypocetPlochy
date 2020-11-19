package lesniplesnivec.plocha;

import org.junit.Test;

import static org.junit.Assert.*;

public class RozestupyTest {

    @Test
    public void minimalniPlocha() {
        Rozestupy objektTypuRozestupy = new Rozestupy();
        Double potrebnaplocha = objektTypuRozestupy.minimalniPlocha(6);
        assertEquals(24D,potrebnaplocha,0);
    }
}