package employe;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Beberapa Employee " + name + " sedang Bekerja: ");
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("1." + "Manager " + getName() + " sedang mengelola tugas.");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("2." + "Developer " + getName() + " sedang Pengembangan code.");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("3." + "Designer " + getName() + " sedang membuat desain.");
    }
}

class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("programmer");
        Manager manager = new Manager("Adi");
        Developer developer = new Developer("Arfan");
        Designer designer = new Designer("Janwar");

        employee.work();
        manager.work();
        developer.work();
        designer.work();
    }
}