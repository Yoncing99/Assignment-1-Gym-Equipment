//ineritance
public class StationaryBike extends GymEquipment {

    //method overriding
    void display(){
        System.out.println("Intro    : A device used as a special-purpose exercise machine resembling a bicycle without wheels but has a saddle, pedals, and handlebars.");
        System.out.println("Function : can help to lose weight and build strength.");
        System.out.println("Stationary Bike is suitable for beginners.");
        System.out.println("Stationary Bike involves cardiovascular system and the lower body.");
        System.out.println("Stationary Bike can display speed, time, mileage, calories burned, and heart rate.");
        System.out.println("Stationary Bike has adjustable tension levels, adjustable seat levels and pedal straps.");
        System.out.println("Stationary Bike has hand pulse sensors for monitoring target heart rate");
    }

    void stepRightPedal(){
        System.out.println("Right！");
    }
    void stepLeftPedal(){
        System.out.println("Left！");
    }
    void levelUp(){
        System.out.println("LevelUp！");
    }
    void levelDown(){
        System.out.println("LevelDown！");
    }
}