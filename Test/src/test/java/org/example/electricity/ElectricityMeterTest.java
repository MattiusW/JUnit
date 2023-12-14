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
        Assert.assertTrue(electricityMeter.getKwh() == 7);

    }

    @Test
    public void addKwh_newMeter11_properAddition() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(2);
        electricityMeter.addKwh(3);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 11);

    }
}