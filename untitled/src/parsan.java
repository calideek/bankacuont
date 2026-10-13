void main(){
    student student1=new student();
    student1.setName("cali");
    System.out.println("Name:"+student1.getName());
    student1.setid(12345);
    System.out.println("ID:"+student1.getId());
    student1.setGpa(56.8);
    System.out.println("GPA:"+student1.getGpa());
    lacturer lacturer1=new lacturer();
    lacturer1.setSalary(400);
    System.out.println("my salaryis:"+lacturer1.getSalary());


}





public class parsan {
    private  String name;
    private int id;
    public void setName(String name) {
        this.name = name;
    }
    public  String getName(){
        return  name;

    }
    public void  setid(int id){
        this.id=id;

    }
    public  int getId(){
        return  id;
    }
}
public class student extends parsan{
    private  double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
public class  lacturer extends parsan{
    private  double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
