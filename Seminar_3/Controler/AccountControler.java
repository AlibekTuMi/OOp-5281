package Seminar_3.Controler;



import Seminar_3.Domen.Worker1;
import Seminar_3.Service.iPersonService;
import Seminar_3.Domen.Person;


public class AccountControler {
    public static <T extends Worker1> void paySalary(T person, int paySalary){
        System.out.println(String.format("%s выплачено %d рублей", person.getName(), paySalary));
    }
//
//    Создал статический метод averageAge для подсчета среднего возраста где:
//    создаю метод статическим , указываю тип Т наследником iPersonService, делаю метод невозвратным и
//    даю название, в скобках указываю тип и присваиваю название
//    создаю переменную sum,
//    через цикл суммирую возраст членов заданной группы
//    вывожу на консоль средний возраст группы
    public static <T extends iPersonService> void averageAge(T group){
        int sum = 0;

        for (int i = 0; i < group.getCount(); i++) {
            sum+=((Person)group.getAll().get(i)).getAge();
        }

        System.out.println(String.format("Средний возраст группы - %f", ((float)sum)/group.getCount()));
    }
}
