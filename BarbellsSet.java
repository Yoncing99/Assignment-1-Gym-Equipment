//inheritance
public class BarbellsSet extends GymEquipment{
    
    String b = "Big";
    int c = 20;

    //method overriding
    void size (){
        System.out.println("Size \t: "+ b);
    }
    void weight (){
        System.out.println("Standard weight : "+ c +" kg");
    }
    void function(){
        System.out.println("Intro    : A long metal bar to which discs of varying weights are attached at each end, used for weightlifting.");
        System.out.println("Function : can help to lose weight and build strength.");
        System.out.println("Barbells Set is suitable for intermediate.");
        System.out.println("Barbells Set used in weight training, bodybuilding, weightlifting and powerlifting.");
        System.out.println("Barbells Set involves strength training and the upper body.");
        System.out.println("Barbells Set has adjustable weight.");
    }
}