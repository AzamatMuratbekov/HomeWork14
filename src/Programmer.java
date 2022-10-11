public class Programmer extends Person {
    public Programmer(String name, String designation) {
        super(name, designation);
    }

    private String companyName;

    public void coding() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;


    }

    @Override
    public String toString() {
        return "Programmer: " +
                "name=" + super.getName()  +
                ", designation=" +super.getDesignation() +
                ", companyName=" + companyName;
    }
}
