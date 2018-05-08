package DependcyWithDependentObject;


public class Employee extends DependecyByConstructor.Employee{
    Address address;
    public Employee() {System.out.println("def cons");}

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
