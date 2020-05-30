//inheritance
public class InclineBenchPress extends GymEquipment{
    
    //constructor overloading
    InclineBenchPress(){

         }
    InclineBenchPress(String a){
        System.out.println("Intro    : A device used as weight training exercise in which the trainee presses a weight upwards while lying on a weight training bench.");
        System.out.println("Function : can help to muscular chest, triceps, deltoids and build strength.");
        System.out.println("Incline Bench Press is suitable for " + a+".");
    }
    InclineBenchPress(String b, String c){
        System.out.println("Incline Bench Press involves "+ b +" system and the "+ c +" body.");
    }
    //method overriding
    void function(){
        System.out.println("Incline Bench Press has adjustable backrest, adjustable weight racks and adjustable squat rack.");
    }
    
}