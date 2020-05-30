//abstract class
public abstract class TestProgram {
    
    public static void main(String[]args){
        
        System.out.println("Let's start the exercise!");

        System.out.printf("\n%45s","TOP 1 - HOME GYM EQUIPMENT");
        System.out.println("\n---------------------------Treadmill----------------------------\n");
        
        //encapsulation and inheritance
        Treadmill t = new Treadmill();
        t.setBrand("NORDICTRACK");
        t.setColor("Black");
        t.setPrice(2000);
        System.out.println("Brand \t: " + t.getBrand());
        System.out.println("Color \t: " + t.getColor());
        System.out.printf("Price \t: RM " + "%.2f",t.getPrice());
        t.pattern();

        System.out.println("\n---INFO---\n");
        //method overloading
        t.info("beginners"); 
        t.info("cardiovascular","full");

        //method overriding
        StationaryBike t1 = new Treadmill(); 
        t1.display();

        System.out.println("\n---WORKOUT---\n");
        t.powerOn();
        t.speedUp();
        t.speedDown();
        t.powerOff();

        System.out.printf("\n%45s","TOP 2 - HOME GYM EQUIPMENT");
        System.out.println("\n------------------------Stationary Bike-------------------------\n");
        
        //encapsulation and inheritance
        StationaryBike s = new StationaryBike();
        s.setBrand("EXERPEUTIC");
        s.setColor("Sliver");
        s.setPrice(800);
        System.out.println("Brand \t: " + s.getBrand());
        System.out.println("Color \t: " + s.getColor());
        System.out.printf("Price \t: RM " + "%.2f",s.getPrice());
        s.pattern();

        System.out.println("\n---INFO---\n");
        //method overriding
        s.display(); 

        System.out.println("\n---WORKOUT---\n");
        s.stepLeftPedal();
        s.stepRightPedal();
        s.levelUp();
        s.levelDown();

        System.out.printf("\n%45s","TOP 3 - HOME GYM EQUIPMENT");
        System.out.println("\n----------------------Incline Bench Press-----------------------\n");
        
        //encapsulation and inheritance
        InclineBenchPress i = new InclineBenchPress();
        i.setBrand("BODY CHAMP");
        i.setColor("Dark Grey");
        i.setPrice(400);
        System.out.println("Brand \t: " + i.getBrand());
        System.out.println("Color \t: " + i.getColor());
        System.out.printf("Price \t: RM " + "%.2f%n",i.getPrice());
        
        // constructor overloading 
        System.out.println("\n---INFO---\n");
        new InclineBenchPress("intermediate");
        new InclineBenchPress("strength training", "upper");
        i.function();

        //inheritance
        System.out.println("\n---WORKOUT---\n");
        i.liftUp();
        i.liftDown();
        i.weightUp();
        i.weightDown();

        System.out.printf("\n%45s","TOP 4 - HOME GYM EQUIPMENT");
        System.out.println("\n-------------------------Dumbbells Set--------------------------\n");
        
        //encapsulation and inheritance
        DumbbellsSet d = new DumbbellsSet();
        d.setBrand("BOWFLEX");
        d.setColor("Red");
        d.setPrice(400);
        System.out.println("Brand \t: " + d.getBrand());
        System.out.println("Color \t: " + d.getColor());
        System.out.printf("Price \t: RM " + "%.2f",d.getPrice());
        
        d.shape();
        d.size();

        System.out.println("\n---INFO---\n");
        d.function();

        //inheritance
        System.out.println("\n---WORKOUT---\n");
        d.weightUp();
        i.liftUp();
        i.liftDown();
        d.weightDown();

        System.out.printf("\n%45s","TOP 5 - HOME GYM EQUIPMENT");
        System.out.println("\n--------------------------Barbells Set--------------------------\n");

        //encapsulation and inheritance
        BarbellsSet b = new BarbellsSet();
        b.setBrand("TECHNOGYM");
        b.setColor("Black");
        b.setPrice(600);
        System.out.println("Brand \t: " + b.getBrand());
        System.out.println("Color \t: " + b.getColor());
        System.out.printf("Price \t: RM " + "%.2f",b.getPrice());
        b.shape();
        b.size();
        b.weight();

        System.out.println("\n---INFO---\n");
        b.function();

        //inheritance
        System.out.println("\n---WORKOUT---\n");
        b.weightUp();
        b.liftUp();
        b.liftDown();
        b.weightDown();
    }
}