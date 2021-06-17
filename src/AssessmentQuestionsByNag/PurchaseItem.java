package AssessmentQuestionsByNag;
 // This Program is for Accessing Parent class private Variable through constructor

public class PurchaseItem {
    //default
    String name;
    //protected
    protected int itemNo;
    //private
    private double unitPrice;
    // Invoking Constructor
    PurchaseItem(){ }
    PurchaseItem(double unitPrice){ //Accessing private variable through Constructor
        unitPrice = unitPrice;
    }
    //public method
    public void getPrice(String Name,double price, int Item){//double price){
        name = Name;
        itemNo = Item;
       unitPrice = price; // call and initializing private variable
    }
    double getUnitPrice(){
        return this.unitPrice;
    }


}
class WeightedItem extends PurchaseItem{
    private double weight;
    //Method
     void getP(String Name, int I, /*double P */ double W) {
        super.name = Name; // can access name variable from parent class if variable is not private
        super.itemNo = I;
        //   super.unitPrice = P; // cannot access unitPrice variable from parent class because it is private
        this.weight = W;
         System.out.println("In the Method \n " + "Name : " + Name +" "+ "Item no : "+ I + " " + "Weight : " + W);
    }
     WeightedItem(){}  //To access Constructor with parameters,have to create default constructor explicitly
    WeightedItem(double price){  //To access private variable, using Constructor
        super(price);
        System.out.println(" Unit price of Private (Parent)Purchased Item class :  " + price);
    }
    double getWeight(){
        return this.weight * super.getUnitPrice();
    }
}

class CountedItem extends PurchaseItem{
    private int quantity;

}

class Challenge {
    public static void main(String[] args) {
        WeightedItem wObj = new WeightedItem(200);
      //  System.out.println("Weighted Item  " + wObj.getP("Rice",20,200));
        wObj.getP("Rice",20,200);
        System.out.println(" Weighted Item Price: "+ wObj.getWeight());


    }



}
