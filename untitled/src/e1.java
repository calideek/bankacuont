public class e1  {
    public static void main(String[] args) {

        Course course1 = new Course("CA314", "Data Structures", 3);
        Course course2 = new Course("MA201", "Discrete Mathematics", 3);

        course1.printCourse();
        course2.printCourse();
    }
}

    class Course {
        String code;
        String name;
        int credits;

        Course(String code, String name, int credits) {
            this.code = code;
            this.name = name;
            this.credits = credits;
        }

        void printCourse() {
            System.out.println(code + " -");
            System.out.println(name);
            System.out.println("(" + credits + " cr)");
            System.out.println();
        }
    }

