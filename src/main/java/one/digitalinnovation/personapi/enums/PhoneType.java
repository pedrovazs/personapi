package one.digitalinnovation.personapi.enums;


public enum PhoneType {

    
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");
    
    private PhoneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private final String description;

}
