class A{
    String accountHolder;
    double balance;
    A(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
}
public class practices {
    static void main() {
        A acount=new A("cali" ,200);
        A acount1=new A("maxamed" ,600);
        System.out.println("accountHolder:"+acount.accountHolder);
        System.out.println("balance:"+acount.balance);
        System.out.println("accountHolder:"+acount1.accountHolder);
        System.out.println("balance:"+acount1.balance);

    }
}