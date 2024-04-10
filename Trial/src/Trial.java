class Information{
    String name;
    int age;
    String gender;
    Information(){
        this.name = "";
        this.age = 0;
        this.gender = "";
    }
}
public class Trial {

    public static void main(String args[]) {
        Information student = new Information();
        student.name = "Tanishq";
        student.age = 22;
        student.gender = "male";
        System.out.println(student.name+" "+student.age+" "+student.gender);
    }
}
