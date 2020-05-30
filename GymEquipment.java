//abstract class
public abstract class GymEquipment {
    
    //encapsulation, inheritance, getters, setters
    private String color, brand;
    private double price;
    char a = 'I';

    //encapsulation, getters, setters
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return color;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public double getPrice(){
        return price;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public String getBrand(){
        return brand;
    }

    //inheritance
    void liftUp(){
        System.out.println("Lift Up!");
    }
    void liftDown(){
        System.out.println("Lift Down!");
    }
    void weightUp(){
        System.out.println("Weight Up!");
    }
    void weightDown(){
        System.out.println("Weight Down!");
    }

    void shape (){
        System.out.println("\nShape \t: roman letters "+ a);
    }
    void pattern(){
        System.out.println("\nPattern : Foldable");
    }
    
}