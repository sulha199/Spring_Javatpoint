package DependencyInjection.DependencyByConstructor;

public class Employee {
    protected int id;
    protected String name;

    public Employee() {System.out.println("def cons parent");}

    public Employee(int id) {this.id = id;}

    public Employee(String name) {  this.name = name;}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(id+" "+name);
    }

}