 class  Employee {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private String name ;
    private int age;
    private String address;
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAddress("arya puri bhood ");
        emp.setAge(18);
        emp.setName("Himanshu");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Address: " + emp.getAddress());
    }

}
