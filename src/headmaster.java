public class headmaster {

    protected Name name;
    protected String IC;
    protected Address address;

    public Name getName() {
        return name;
    }

    void SetName(Name name){
        this.name = name;
    }

    public String getIC() {
        return IC;
    }

    void SetIC(String IC){
        this.IC = IC;
    }

    public Address getAddress() {
        return address;
    }

    void SetAddress(Address address){
        this.address = address;
    }
}