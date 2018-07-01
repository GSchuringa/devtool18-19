public class Customer {
    private String name;
    private int id;

    public Customer(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (!Customer.class.isAssignableFrom(o.getClass())) {
            return false;
        }
        final Customer c = (Customer)o;

        return this.name.equals(c.getName());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer " + this.id + ": " + this.name;
    }
}


