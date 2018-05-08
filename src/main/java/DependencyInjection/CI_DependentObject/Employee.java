package DependencyInjection.CI_DependentObject;


public class Employee extends DependencyInjection.DependencyByConstructor.Employee {
    protected Address address;
    public Employee() {System.out.println("def cons c1");}

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Address address) {
        super();

        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void show(){
        System.out.println(id+" "+name);
        System.out.println(address.toString());
    }
}
