public class Singer extends Person{

    public Singer(String name, String designation) {
        super(name, designation);
    }
    private String bandName;
    public void singing(){

    }
    public void playGitar(){

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer: " +
                "name=" + super.getName()  +
                ", designation=" +super.getDesignation() +
                ", bandName=" + bandName;
    }
}
