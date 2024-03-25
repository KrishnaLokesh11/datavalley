class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
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

    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
}

public class clone {
    public static void main(String[] args) {
        Organization org1 = new Organization("123", "ABC Corp", "123 Main St");
        Organization org2 = org1.clone();

        System.out.println("Original Organization:");
        org1.printDetails();
        System.out.println("\nCloned Organization:");
        org2.printDetails();
    }
}
