package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Seminar_3.Controler.AccountControler;
import Seminar_3.Domen.Employee;
import Seminar_3.Domen.PersonComparator;
import Seminar_3.Domen.Student;
import Seminar_3.Domen.StudentStream;
import Seminar_3.Domen.StudentsGroup;
import Seminar_3.Domen.Teacher;
import Seminar_3.Service.EmployeeServise;
import Seminar_3.Service.StudentService;
import Seminar_3.Service.TeacherService;


public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Андрей", 19, 7);
        Student student2 = new Student("Сергей", 20, 35);
        Student student3 = new Student("Константин", 20, 12);
        Student student4 = new Student("Илья", 19, 66);
        Student student5 = new Student("Анна", 23, 17);
        Student student6 = new Student("Ольга", 22, 39);
        Student student7 = new Student("Светлана", 18, 84);
        Student student8 = new Student("Ульяна", 21, 81);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student6);
        students.add(student4);
        students.add(student5);
        students.add(student8);
        students.add(student7);
        students.add(student3);

        Student student10 = new Student("Инокентий", 19, 7);
        Student student11 = new Student("Святослав", 20, 35);
        Student student12 = new Student("Вячеслав", 20, 12);
        Student student13 = new Student("Ирина", 19, 66);
        Student student14 = new Student("Анна", 23, 17);
        Student student15 = new Student("Алина", 22, 39);

        List<Student> students2 = new ArrayList<>();

        students2.add(student10);
        students2.add(student11);
        students2.add(student12);
        students2.add(student13);
        students2.add(student14);
        students2.add(student15);

        Student student20 = new Student("Святогор", 19, 7);
        Student student21 = new Student("Алексей", 20, 35);
        Student student22 = new Student("Василиса", 20, 12);
        Student student23 = new Student("Алёнушка", 19, 66);

        List<Student> students3 = new ArrayList<>();

        students3.add(student20);
        students3.add(student21);
        students3.add(student22);
        students3.add(student23);

        Student student30 = new Student("Платон", 19, 7);
        Student student31 = new Student("Егор", 20, 35);
        Student student32 = new Student("Виолетта", 20, 12);
        Student student33 = new Student("Матрона", 19, 66);

        List<Student> students4 = new ArrayList<>();

        students4.add(student30);
        students4.add(student31);
        students4.add(student32);
        students4.add(student33);

        StudentsGroup studentsGroup1 = new StudentsGroup(1111, students);
        StudentsGroup studentsGroup2 = new StudentsGroup(2222, students2);
        StudentsGroup studentsGroup3 = new StudentsGroup(3333, students3);
        StudentsGroup studentsGroup4 = new StudentsGroup(4444, students4);

        StudentStream studentStream = new StudentStream();

        studentStream.add(studentsGroup2);
        studentStream.add(studentsGroup4);
        studentStream.add(studentsGroup1);
        studentStream.add(studentsGroup3);

        // for (Student student : studentsGroup1) {
        // System.out.println(student);
        // }
        // System.out.println("--------------------------");
        // Collections.sort(studentsGroup1.getStudents());
        // for (Student student : studentsGroup1) {
        // System.out.println(student);
        // }






        // С помощью данных циклов вывожу список студентов с присвоением потока, далее каждой группе присваиваю номер и вывожу список студентов
        // После вывожу повторно тоже самое, но в отсортированном виде по количеству студенотв в группах

        // System.out.println("Номер потока - " + studentStream.getNumbStream());
        // for (StudentsGroup studentGroup : studentStream) {
        // System.out.println();
        // System.out.println("Номер группы - " + studentGroup.getNumbGroup());
        // System.out.println();
        // for (Student student : studentGroup) {
        // System.out.println(student);
        // }
        // System.out.println("--------------------------");
        // }

        // System.err.println();
        // System.out.println("Отсортированный поток");
        // System.out.println();

        // Collections.sort(studentStream.getStudentStream());

        // System.out.println("Номер потока - " + studentStream.getNumbStream());

        // for (StudentsGroup studentGroup : studentStream) {
        // System.out.println();
        // System.out.println("Номер группы - " + studentGroup.getNumbGroup());
        // System.out.println();
        // for (Student student : studentGroup) {
        // System.out.println(student);
        // }
        // System.out.println("--------------------------");
        // }




        // Данный код выводит номер потока, далее через цикл выводит номер группы и данные группы со списком студентов
        // В отсортированном выводится тоже самое, но группы отсортированны по количеству студентов

        // System.out.println("Номер потока - " + studentStream.getNumbStream());
        // for (StudentsGroup studentGroup : studentStream) {
        //     System.out.println();
        //     System.out.println();
        //     System.out.println(studentGroup);
        //     System.out.println("--------------------------");
        // }
        // System.err.println();
        // System.out.println("Отсортированный поток");
        // System.out.println();
        // Collections.sort(studentStream.getStudentStream());
        // for (StudentsGroup studentGroup : studentStream) {
        //     System.out.println();
        //     System.out.println();
        //     System.out.println(studentGroup);
        //     System.out.println("--------------------------");
        // }



            // В данном коде выполняется все как и кодом выше за ислючением если снять закоментированный код в 
            // файле StudentGroup с 60 по 64 строку где дополнительно реализован метод сортировки по номеру группы

        // System.out.println(studentStream);
        // Collections.sort(studentStream.getStudentStream());
        // System.err.println();
        // System.out.println("Отсортированный поток");
        // System.out.println();
        // System.out.println(studentStream);



        Teacher teacher1 = new Teacher("Лидия Владимировна", 55, "учитель русского языка и литературы");
        Teacher teacher2 = new Teacher("Любовь Васильевна", 53, "учитель математики");
        Teacher teacher3 = new Teacher("Елена Васильевна", 36, "учитель географии");
        Teacher teacher4 = new Teacher("Тамара Арнольдовна", 42, "учитель химии");
        Teacher teacher5 = new Teacher("Анна Юзефовна", 40, "учитель младших классов");

        Employee employee1 = new Employee("Иван", 40, "Библиотекарь");
        Employee employee2 = new Employee("Даниил", 35, "Хоз. рабочий");
        Employee employee3 = new Employee("Анатолий", 28, "Пекарь");
//            System.out.println(new PersonComparator<Teacher>().compare(teacher4, teacher5));
//            System.out.println(new PersonComparator<Student>().compare(student12, student33));
            // AccountControler controler = new AccountControler();

//            AccountControler.paySalary(teacher4, 19000);
//            AccountControler.paySalary(employee, 20000);
            TeacherService teacherService = new TeacherService();
            teacherService.add(teacher1);
            teacherService.add(teacher2);
            teacherService.add(teacher3);
            teacherService.add(teacher4);
            teacherService.add(teacher5);

            StudentService studentService = new StudentService();
            studentService.add(student1);
            studentService.add(student2);
            studentService.add(student3);
            studentService.add(student4);
            studentService.add(student5);
            studentService.add(student6);

            EmployeeServise employeeServise = new EmployeeServise();
            employeeServise.add(employee1);
            employeeServise.add(employee2);
            employeeServise.add(employee3);


            AccountControler.averageAge(employeeServise);

    }
}
