class book{
    String name;
    double price;
    static  String  madbacad="BADAR";
    book(String name,double price){
        this.name=name;
        this.price=price;
    }
}
public class e2 {
    static void main() {
        book b1 =new book("waan koray",10.25);
        book b2=new book("wiilwal",8.25);
        System.out.println("xogta buugagta waa kan");
        System.out.println("Name:"+b1.name);
        System.out.println("PRICE:"+b1.price);

        System.out.println("Name:"+b2.name);
        System.out.println("PRICE:"+b2.price);
        System.out.println("madbacada:"+book.madbacad);
    }
}