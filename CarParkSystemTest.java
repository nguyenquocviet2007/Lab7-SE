public class CarParkSystemTest {
    public static void main(String[] args) throws Exception{
        terminateAPermitTest();
    }
    public static void  addEmployeeTest() throws Exception{
        System.out.println("Test Add Employee");

        CarParkSystem cps = new CarParkSystem();
        cps.addEmployee("E1", "Peter", "0909898989");
        cps.addEmployee("E2", "Jack", "0908898989");
        cps.addEmployee("E3", "Brat", "0907898989");

        try{
            cps.addEmployee("E1", "Peter", "0909898989");
        }
        catch(Exception e){

        }
    }
    public static void updateEmployeePhoneNrTest() throws Exception{
        System.out.println("Test Update Employee Phone");

        CarParkSystem cps = new CarParkSystem();
        cps.updateEmployeePhoneNr("E1", "0903323232");

        try{
            cps.updateEmployeePhoneNr("E4", "0909090909");
        }
        catch(Exception e){

        }
    }
    public static void addPermitTest() throws Exception{
        System.out.println("Test Add Permit");

        CarParkSystem cps = new CarParkSystem();
        cps.addPermit("4567", "2", "E1");
        cps.addPermit("3456", "1", "E2");

        try{
            cps.addPermit("4567", "2", "E1");
        }
        catch(Exception e){

        }
    }
    public static void deleteEmployeeTest() throws Exception{
        System.out.println("Test Delete Employee");

        CarParkSystem cps = new CarParkSystem();
        cps.deleteEmployee("E3");

        try{
            cps.deleteEmployee("E4");
        }
        catch(Exception e){

        }
    }
    public static void terminateAPermitTest() throws Exception{
        System.out.println("Test Terminate a Permit");

        CarParkSystem cps = new CarParkSystem();
        cps.removePermits("4567");

        try{
            cps.removePermits("1234");
        }
        catch(Exception e){
            
        }
    }
    public static void replacePermitTest(String[] args) throws Exception{
        System.out.println("Test Replace a Permit");

        CarParkSystem cps = new CarParkSystem();
        cps.replacePermit("3456", "1111", "1");

        try{
            cps.replacePermit("5678", "2222", "2");
        }
        catch(Exception e){

        }
    }
    public static void searchForOwnerDetailsTest(String[] args) throws Exception{
        System.out.println("Test Search For Owner Details");
        
        CarParkSystem cps = new CarParkSystem();
        System.out.println(cps.searchForOwnerDetails("1111"));

        try{
            System.out.println(cps.searchEmployee("5678"));
        }
        catch(Exception e){

        }
    }
    public static void listAllPermitTest(String[] args) throws Exception{
        System.out.println("Test list All Permit");

        CarParkSystem cps = new CarParkSystem();
        System.out.println(cps.listAllPermit());
    }
}
