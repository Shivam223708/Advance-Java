package Vehicle;

public class Vehicles_Main {
    public static void main(String[] args) {
        Bicycle By= new Bicycle();
        Bike Bi = new Bike();
        Bi.changegear(3);
        Bi.speedUp(2);
        Bi.applybrakes(1);
        By.changegear(3);
        By.speedUp(2);
        By.applybrakes(1);
    }
}
