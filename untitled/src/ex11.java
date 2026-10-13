class  names{
    String name;
    int age;
    double salary;
    static  int numbers=0;
    names(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        numbers++;
    }
}
public class ex11 {
    static void main() {
        names n=new names("cali maxmed",23,900.5);
        names n1=new names("caasho maxmed",27,700.5);
        names n2=new names("axmedmaxmed",17,800.5);
        System.out.println("name:"+n.name );
    }
}