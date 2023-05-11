package backendjava.project.week4.project;

public class Hospital {
    private String name;
    private String phoneNumber;
    private Address address;

    public Hospital(String name, String phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
