/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectModelsPractice;

/**
 *
 * @author evanhorton
 */
public class VehicleClass {
      String vinNumber;
      int doorNumber;
      int airbagsNumber;
      double massOfVehicle;
      String crashTestRating;
      int numAirbags;
      int numWheels;
      String brandCar;
      String color;
      String headLightType;
      String engineType;
      String doorType;
      int weightOfGas;
      
      
      /**
       * 
       * @param totalmassCar
       * @param acceleration
       * @return impactForce
       */
      private double calcImpactForce(double totalmassCar,double acceleration){
          return 0.0;
          
      }
      
      private double calcAcceleration(){
                    return 0.0;

          
      }
      
      private double weightOfGas(){
                    return 0.0;

          
          //weightofGas=density gas*volume left in tank
          
          
      }
      
      private boolean containsSeatbelts(){
          return true;
          
          
      }
      
      double totalMassCar = weightOfGas + massOfVehicle;
      
      
              
              
     
}

 class PersonalCarClass extends VehicleClass{
    
    
}

class Truck extends PersonalCarClass{
    
    
}

class Sedan extends PersonalCarClass{
    
    
}

class SUV extends PersonalCarClass{
    
    
}

class SportsCar extends PersonalCarClass{
    
    
}

class Minivan extends PersonalCarClass{
    
    
}

class CommercialCarClass extends VehicleClass{
    int dotID;
    String companyName;
    String jobType;
    String licenseNeeded;
    String specialtyAttatchment;
    
    
    
}

