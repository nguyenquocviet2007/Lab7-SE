public class CarParkSystemTest {
    public static void main(String[] args) throws Exception{
        terminateAPermitTest();
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
            cps.replacePermit("4567", "2222", "2");
        }
        catch(Exception e){

        }
    }
    public static void searchForOwnerDetailsTest(String[] args) throws Exception{
        System.out.println("Test Search For Owner Details");
        
        CarParkSystem cps = new CarParkSystem();
        System.out.println(cps.searchForOwnerDetails("1111"));

        try{
            System.out.println(cps.searchEmployee("4567"));
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
