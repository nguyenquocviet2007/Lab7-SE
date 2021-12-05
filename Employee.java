import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Employee{
    private String id;
    private String name;
    private String phone;
    private HashSet<Permit> permits;

    public Employee(String id, String name, String phone, HashSet<Permit> permits) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.permits = permits;
    }
    //public String toString(){};
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setPermit(Permit newPermit) {
        this.permits.add(newPermit);
    };
    public String getID(){
        return id;
    }
    public HashSet<Permit> getPermits() {
        return permits;
    };
    public String getName(){
        return name;
    }
    public String getPhone(){
         return phone;
    }
}
