package Seminar_3.Domen;

public class Teacher extends Worker1{
    private String academicDegree;

    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }
    public String getAcademicDegree() {
        return academicDegree;
    }
    
}
