package Seminar_3.Service;

import java.util.ArrayList;
import java.util.List;

import Seminar_3.Domen.Employee;
import Seminar_3.Domen.PersonComparator;
import Seminar_3.Domen.Student;


public class EmployeeServise implements iPersonService<Employee>{
    private int countEmployee;
    private List<Employee> employeeList;
    
    public EmployeeServise() {
        
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "Разнорабочий");
        employeeList.add(emp);
        countEmployee++;
    }
     public void sortByFamily(){
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employeeList.sort(persComp);
    }

    @Override
    public String toString() {
        String listEmployee = "";

        for (Employee employee : employeeList) {
            listEmployee+=employee;
            listEmployee+="\n";
        }
        return String.format("Количество работников: %d, Список работников \n\n%s",countEmployee, listEmployee);
    }

    @Override
    public int getCount() {
        return countEmployee;
    }
    public void add (Employee a) {
        employeeList.add(a);
        countEmployee++;
    }
    
}
