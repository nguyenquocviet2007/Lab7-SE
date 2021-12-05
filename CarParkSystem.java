import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CarParkSystem {
    private Set<Employee> employeeList;
    private Set<Permit> allPermits;
    public CarParkSystem(){
        employeeList = new HashSet<Employee>();
        allPermits = new HashSet<Permit>();
    }
    //public String toString(){}

    public Employee searchEmployee(String id){
        Employee employee = null;
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()){
            Employee emp = (Employee) itr.next();
            if (emp.getID().equals(id)){
                employee = emp;
                break;
            }
        }
        return employee;
    }

    public Permit searchPermit(String permitNr){
        Permit permits = null;
        Iterator<Permit> itr = allPermits.iterator();
        while (itr.hasNext()){
            Permit p = itr.next();
            if (p.getPermitNr().equals(permitNr)){
                permits = p;
            }
        }
        return permits;
    }
    //use case 5
    public void removePermits(String permitNr) throws Exception{
        boolean pre = (searchPermit(permitNr) != null);
        if(!pre){
            String message = "Error!!! Permit is already removed or does not exist";
            System.out.println(message);
            throw new Exception(message);
        }
        Employee owner = searchPermit(permitNr).getOwner();
        Iterator<Permit> itr = allPermits.iterator();
        while (itr.hasNext()){
            Permit permits = (Permit) itr.next();
            if (permits.getPermitNr().equals(permitNr)){
                itr.remove();
            }
        }
        itr = owner.getPermits().iterator();
        while (itr.hasNext()){
            Permit permits = (Permit) itr.next();
            if (permits.getPermitNr().equals(permitNr)){
                itr.remove();
            }
        }
    }
    //use case 6
    public void replacePermit(String oldPermitNr, String newPermitNr, String regNr) throws Exception{
        Permit oldPermit = searchPermit(oldPermitNr);
        Permit newPermit = searchPermit(newPermitNr);
        Employee owner = oldPermit.getOwner();
        boolean pre = (oldPermit != null) && (newPermit != null) && (regNr != oldPermit.getRegNr());

        if (!pre){
            String message = "Error!!! Permit does not exist or New permit already existed or Registration number already existed";
            System.out.println(message);
            throw new Exception(message);
        }
        allPermits.remove(oldPermit);
        allPermits.add(new Permit(newPermitNr, regNr, owner));

        owner.getPermits().remove(oldPermit);
        owner.getPermits().add(new Permit(newPermitNr, regNr, owner));
    }
    //use case 7
    public String searchForOwnerDetails(String permitNr) throws Exception{
        Permit permits = searchPermit(permitNr);
        boolean pre = (permits != null);
        if (!pre){
            String message = "Error!!! Permit does not exist";
            System.out.println(message);
            throw new Exception(message);
        }

        Employee owner = permits.getOwner();
        String displayOwner = String.format("%-20s | %-20s | %-20s\n", "ID", "Name", "Phone");
        displayOwner += new String(new char[displayOwner.length()]).replace("\0", "-") + "\n";
        displayOwner += String.format("%20s | %20s | %20s", owner.getID(), owner.getName(), owner.getPhone());
        return displayOwner;
    }
    //use case 8
    public String listAllPermit() throws Exception {
        boolean pre = (allPermits.isEmpty());
        if (pre){
            String message = "Error!!! the list is empty";
            System.out.println(message);
            throw new Exception(message);
        }
        String displayOwner = String.format("%-20s | %-20s | %-20s | %-20s\n", "Permit Number", "ID", "Name", "Phone");
        displayOwner += new String(new char[displayOwner.length()]).replace("\0", "-") + "\n";
        Iterator<Permit> itr = allPermits.iterator();
        while (itr.hasNext()){
            Permit p = itr.next();
            displayOwner += String.format("%20s | %20s | %20s | %20s", p.getPermitNr(), p.getOwner().getID(), p.getOwner().getName(), p.getOwner().getPhone());
        }
        return displayOwner;
    }
}

