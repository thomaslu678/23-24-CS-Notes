package org.canyonsdistrict.hhs.conditionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxReturnTest {

    @Test
    public void testGetTax_single_below_threshold(){
        var taxReturn = new TaxReturn(29000, TaxReturn.SINGLE);
        Assertions.assertEquals(2900, taxReturn.getTax());
    }

    @Test
    public void testGetTax_single_aboveThreshold(){
        var taxReturn = new TaxReturn(33000, TaxReturn.SINGLE);
        Assertions.assertEquals(3450, taxReturn.getTax());
    }

    @Test
    public void testGetTax_married_belowThreshold(){
        var taxReturn = new TaxReturn(64000, TaxReturn.SINGLE);
        Assertions.assertEquals(6400, taxReturn.getTax(), 0);
    }

    @Test
    public void testGetTax_married_aboveThreshold(){
        var taxReturn = new TaxReturn(65000, TaxReturn.SINGLE);
        Assertions.assertEquals(6650, taxReturn.getTax(), 0);
    }

}
