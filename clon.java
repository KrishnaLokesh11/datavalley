Class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;
    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }
    public String getOrganizationCode() {
        return organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization("ABC123", "Organization A", "123 Main St, City");
        Organization org2 = org1.clone();
        System.out.println("Original Organization:");
        org1.printDetails();
        System.out.println("\nCloned Organization:");
        org2.printDetails();
    }
}