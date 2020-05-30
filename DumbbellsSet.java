//inheritance
public class DumbbellsSet extends GymEquipment{

    String b = "Small";

    //method overriding
    void size (){
        System.out.println("Size \t: "+ b);
    }
    void function(){
        System.out.println("Intro    : A short bar with weights on either side which people use for physical exercise to strengthen their arm and shoulder muscles.");
        System.out.println("Function : can help to lose weight and build strength.");
        System.out.println("Dumbbells Set is suitable for beginners.");
        System.out.println("Dumbbells can be used individually or in pairs");
        System.out.println("Dumbbells Set involves strength training and the upper body.");
        System.out.println("Dumbbells Set has adjustable dumbbells with differing weights.");
    }
}