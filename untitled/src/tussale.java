//
// class student {
//    String name;
//    int age;
//    static String university="jamuuriya";
//    student(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
// }
// public class tussale {
//     static void main() {
//         student s1=new student("cali axmed",23);
//         student s2=new student("cabdi maxamed",25);
//
//
//
//         System.out.println("name:"+s1.name);
//         System.out.println("age:"+s1.age);
//         System.out.println("name:"+s2.name);
//         System.out.println("name:"+s2.age);
//         System.out.println("jamacada:"+student.university);
//     }
//}

class Arday{
    String name;
    int age;
    static String school="Alhilal";
    Arday(String name, int age){
        this.name=name;
        this.age=age;
    }

}

public class tussale {
    static void main() {
        Arday a1=new Arday("cali maxamed",23);
        Arday a2=new Arday("cabdi maxamed",25);
        System.out.println("name:"+a1.name);
        System.out.println("age:"+a1.age);
        System.out.println("name:"+a2.name);
        System.out.println("age:"+a2.age);
        System.out.println("school:"+Arday.school);
    }
}



















