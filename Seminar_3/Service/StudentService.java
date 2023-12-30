package Seminar_3.Service;

import java.util.ArrayList;
import java.util.List;

import Seminar_3.Domen.PersonComparator;
import Seminar_3.Domen.Student;


public class StudentService implements iPersonService<Student>{
    
    private  int countStudents;
    private List<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
        
    }
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        studentList.add(stud);
        countStudents++;
    }
    public void sortByFamily(){
        PersonComparator<Student> persComp = new PersonComparator<Student>();
        studentList.sort(persComp);
    }
    @Override
    public String toString() {
        String listStudents = "";
        for (Student student : studentList) {
            listStudents+=student;
            listStudents+="\n";
        }
        return String.format("Количество студентов: %d, Список студентов \n\n%s",countStudents, listStudents);
    }
    @Override
    public int getCount() {
        return countStudents;
        
    }
    public void add (Student a){
        studentList.add(a);
        countStudents++;
    }
    
}
