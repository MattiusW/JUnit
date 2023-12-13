package org.example.electricity;

import java.util.Calendar;

public class ElectricityMeter {

   private float kwh = 0;
   private int centsForKwh = 0;
   private boolean tariffOn = false;
   private float kwtTariff = 0;
   private int getCentsForKwhTariff = 0;
   private int electricityTariffStartHour = 0;
   private int getElectricityTariffEndHour = 0;

   public void addKwh(float kwhToAdd){
      if (isTariffNow()){
         kwtTariff += kwhToAdd;
      }
      else{
         kwh += kwhToAdd;
      }
   }

   private boolean isTariffNow(){
      Calendar rightNow = Calendar.getInstance();
      int hour = rightNow.get(Calendar.HOUR_OF_DAY);
      return hour > electricityTariffStartHour && hour < electricityTariffStartHour;
   }

   /**
    *
    * @return how much more expensive is normal price comparing to tariff in percentages
    */
   public int getHowMoreExpensiveNormalls(){
      return (centsForKwh * 100 / getCentsForKwhTariff) - 100;
   }

   public float getKwh() {
      return kwh;
   }

   void setCentsForKwh(int centsForKwh) {
      this.centsForKwh = centsForKwh;
   }

   void setTariffOn(boolean tariffOn) {
      this.tariffOn = tariffOn;
   }

   void setGetCentsForKwhTariff(int getCentsForKwhTariff) {
      this.getCentsForKwhTariff = getCentsForKwhTariff;
   }

   void setElectricityTariffStartHour(int electricityTariffStartHour) {
      this.electricityTariffStartHour = electricityTariffStartHour;
   }

   void setGetElectricityTariffEndHour(int getElectricityTariffEndHour) {
      this.getElectricityTariffEndHour = getElectricityTariffEndHour;
   }


}
