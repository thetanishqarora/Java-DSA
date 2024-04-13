public class Main {
    public static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Student s1 = new Student("John", 25);
        System.out.println("Name of student: " + s1.name);
        System.out.println("Age of student: " + s1.age);

        System.out.println("Factorial of 9 is: " + factorial(9));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}
