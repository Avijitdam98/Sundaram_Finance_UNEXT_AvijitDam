public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee[] obj = new Employee[3];
        obj[0] = new Employee(10, "ann", 7000);
        obj[1] = new Employee(11, "bann", 17000);
        obj[2] = new Employee(12, "kann", 27000);

        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getSalary() > 10000) {
                System.out.println(obj[i].getName());
            }
        }

        System.out.println("using enhanced for loop");
        for (Employee lokesh : obj) {
            if (lokesh.getSalary() > 10000) {
                System.out.println(lokesh.getName());
            }
        }
    }
}
