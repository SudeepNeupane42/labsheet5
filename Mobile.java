
package labsheet5;

public class Mobile {
    private String type;
    private String phoneNumber;

    public String getType() {
        return type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setDetails(String type,String ph) {
        this.phoneNumber = ph;
        this.type=type;
    }
    
    
}
