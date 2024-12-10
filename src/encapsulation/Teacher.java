package encapsulation;

public class Teacher {

    public int teachingClass;

    private int id;

    String degree;// default for package-private

    public static void main(String[] args){
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }
}
