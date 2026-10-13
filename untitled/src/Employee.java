class Employee {

    String name;
    int salary;

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.name = "Ahmed";
        m.salary = 1000;

        System.out.println("Name: " + m.name);
        System.out.println("Salary: " + m.salary);

        m.work();
    }
}