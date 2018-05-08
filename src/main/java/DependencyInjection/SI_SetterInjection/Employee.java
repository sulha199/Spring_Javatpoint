package DependencyInjection.SI_SetterInjection;

public class Employee extends DependencyInjection.CI_DependentObject.Employee {
    private String city;

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

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println(id+" "+name+" "+city);
    }
}
