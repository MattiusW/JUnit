package org.example.electricity;

import org.junit.Assert;
import org.junit.Test;



public class ElectricityMeterTest {

    @org.junit.Test
    public void addKwh_newMeter_properAddition() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);

    }

    //Method, context, behavior
    @Test
    public void addKwh_newMeter7_properAddition() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(2);
        electricityMeter.addKwh(5);
        Assert.assertTrue("Addition 2 and 5 should be 7: ", electricityMeter.getKwh() == 7);

    }

    @Test
    public void addKwh_newMeterFalse_properAddition() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(2);
        electricityMeter.addKwh(3);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(1);
        Assert.assertFalse(electricityMeter.getKwh() == 13);

    }

    @Test
    public void kwhCounterIncreas(){
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(11);
        electricityMeter.addKwh(11);
        Assert.assertTrue(electricityMeter.getKwh() == 22);
    }

    //Given when then
    @Test
    public void givenNewMeterWhenFirstAdditionThenIncreaseCounter(){
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(7);
        electricityMeter.addKwh(7);
        electricityMeter.addKwh(7);
        Assert.assertTrue(electricityMeter.getKwh() == 21);
    }

    //Test handle exception
    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalls() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalls();
    }
}