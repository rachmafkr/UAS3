package uas2;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void work() {
        System.out.println("Employee " + name + " is currently working on a deadline.");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is currently on duty out of town.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is having a meeting with the client on the upper floor.");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Designer " + getName() + "  is currently working on the design ordered by the client.");
    }
}

public class Work {
    public static void main(String[] args) {
        Employee employee = new Employee("David");
        Manager manager = new Manager("Gita");
        Developer developer = new Developer("Hanna");
        Designer designer = new Designer("Rachma");

        employee.work();
        manager.work();
        developer.work();
        designer.work();
    }
}

