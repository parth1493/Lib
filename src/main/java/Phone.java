public class Phone {

    private String contactName;
    private String contactNumber;
    private String contactType;

    public Phone(String contactName, String contactNumber, String contactType) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactType = contactType;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}

