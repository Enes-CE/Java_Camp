public class Product {

    public Product(){
        System.out.println("Ben çalıştım");
    }

    public Product(int id,String name,double unitPrice,String detail){  // Overloading yaptıkkk!!!
        this.id = id;  //this dediğimiz şey bu class taki özellik yani bu classtaki id.
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
    int id;
    String name;
    double unitPrice;
    String detail;
}
