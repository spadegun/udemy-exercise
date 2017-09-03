package idv.spadegun.constructors;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public VipCustomer() {
        this("default",0.0,"default");
    }

    public VipCustomer(String name, double creditLimit) {

        this.name = name;

        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
