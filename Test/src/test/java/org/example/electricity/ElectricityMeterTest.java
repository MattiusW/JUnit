package org.example.electricity;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ElectricityMeterTest {

    @org.junit.Test
    public void addKwh() {

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);

    }
}