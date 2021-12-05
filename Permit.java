public class Permit {
    private String permitNr;
    private String regNr;
    private Employee owner;

    public Permit(String permitNr, String regNr, Employee owner) {
        this.permitNr = permitNr;
        this.regNr = regNr;
        this.owner = owner;
    }
    //public String toString(){};
    public String getPermitNr(){
        return permitNr;
    }
    public Employee getOwner(){
        return owner;
    }
    public String getRegNr(){
        return regNr;
    }
}
