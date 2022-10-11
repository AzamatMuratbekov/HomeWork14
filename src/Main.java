public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Азамат","программист","PeakSoft");
        Dancer dancer = new Dancer("Бермет","танцовщица","Тик-ток");
        Singer singer = new Singer("Мирбек","певец","отсутстует");
        System.out.println(programmer.toString());
        System.out.println(dancer.toString());
        System.out.println(singer.toString());
    }
}