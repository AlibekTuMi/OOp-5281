package Seminar_3.Service;

import java.util.ArrayList;
import java.util.List;

import Seminar_3.Domen.PersonComparator;
import Seminar_3.Domen.Teacher;
//создал класс и имплементировал к интерфейсу с указанием класса
public class TeacherService implements iPersonService<Teacher> {
//    приватная переменная количество учителей
    private int countTeachers;
//    приватный список учителей
    private List<Teacher> listTeachers;

    /**
     * Добавил Класс TeacherService со списком учителей
     */
    public TeacherService() {
        listTeachers = new ArrayList<>();
    }

    /**
     *Переопределил метод где возвращается весь список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return listTeachers;
    }

    /**
     * Переопределил метод create, где присваиваю:
     * @param name - имя
     * @param age - возраст
     * academicDegree если не присвоено "учитель"
     * добавляю учителя в список учителей
     * увеличиваю счетчик учителей на 1
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "учитель");
        listTeachers.add(teacher);
        countTeachers++;
    }
//    Создал метод сортировки учителей по заданному параметру в PersonComparator
    public void sortByFamily(){
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        listTeachers.sort(persComp);
    }
//    Переопределил метод, где создал строку, в которую через цикл добавляю
//    учителей из созданного списка
//    Далее вывожу подсчитанное количество учителей и список учителей с новой строки
    @Override
    public String toString() {
        String listArrayTeachers = "";
        for (Teacher teacher : listTeachers) {
            listArrayTeachers+=teacher;
            listArrayTeachers+="\n";
            
        }
        return String.format("Количество учителей: %d, Список учителей: \n\n%s",countTeachers, listArrayTeachers);
    }
//    Переопределил метод, где возвращаю количество учителей
    @Override
    public int getCount() {
        return countTeachers;
    }
//    Создал метод, с помощью которого добавляю учителя в список учителей
    public void add (Teacher a){
        listTeachers.add(a);
        countTeachers++;
    }
}
