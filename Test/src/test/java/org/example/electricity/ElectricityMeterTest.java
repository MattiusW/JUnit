package org.example.electricity;

import org.junit.Assert;


public class ElectricityMeterTest {

    @org.junit.Test
    public void addKwh_newMeter_properAddition() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);

    }
}