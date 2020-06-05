package lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public void info(){
        System.out.println(fio + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}
