//inheritance
public class Treadmill extends StationaryBike{

    //method overloading
    void info(String a){
        System.out.println("Intro    : A device that consists of a moving belt on which a person walks, runs or climbs while staying in the same place. ");
        System.out.println("Function : can help to lose weight and build strength.");
        System.out.println("Treadmill is suitable for " + a +".");
    }
    void info(String b, String c){
        System.out.println("Treadmill involves "+ b +" system and the "+ c +" body.");
    }
    
    //method overriding
	void display(){
        System.out.println("Treadmill can display speed, time, mileage, calories burned, and heart rate.");
        System.out.println("Treadmill have adjustable incline levels.");        
    }
    
    void powerOn(){
        System.out.println("On!");
    }
    void speedUp(){
        System.out.println("Speed Up!");
    }
    void speedDown(){
        System.out.println("Speed Down!");
    }
    void powerOff(){
        System.out.println("Off!");
    }

}