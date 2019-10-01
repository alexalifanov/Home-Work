package Task6;

public class Pond {
    private WaterLily waterLily;
    public Pond() {
        this.waterLily = new WaterLily();
    }
    public void sunset() {
        System.out.println("Смеркается");
        waterLily.revealed();
    }
    public void dawn () {
        System.out.println("Рассветает");
        waterLily.closes();
    }
}
