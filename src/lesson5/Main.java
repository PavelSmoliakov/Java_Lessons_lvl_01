package lesson5;

public class Main {
    public static void main(String[] args) {


        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Petrov Petr Petrovich", "cleaner","bestcleaner81@gmail.com",324765,25000,45);
        persArray[1] = new Employee("Sidorov Oleg Stepanovich", "manager","oleg65@gmail.com",324564,50000,35);
        persArray[2] = new Employee("Smoliakov Pavel Dmitrievich","CEO","smoliakovpavel@gmail.com",324824,100000, 27);
        persArray[3] = new Employee("Ivanov Ivan Ivanovich", "accountant", "superivan@gmail.com", 324878, 60000, 41);
        persArray[4] = new Employee("Smirnov Andrey Olegovich", "designer", "bigboss77@gmail.com", 324666, 45000, 37);


        System.out.println("Список сотрудников организации: \n");
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].info();
        }

        System.out.println();

        System.out.println("Список сотрудников организации старше 40 лет: \n");
        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }

}
