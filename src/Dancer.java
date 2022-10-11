public class Dancer extends Person{
    public Dancer(String name, String designation) {
        super(name, designation);
    }
    private String groupName;
    public void dancing(){

    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return  "Dancer: " +
                "name=" + super.getName()  +
                ", designation=" +super.getDesignation() +
                ", groupName=" + groupName;
    }
}
