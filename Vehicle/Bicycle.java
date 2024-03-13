package Vehicle;

public class Bicycle implements Vehicle{

    int gear;
    int brakes;
    int speed;
    @Override
    public void changegear(int gear) {
        this.gear = gear;
        System.out.println(gear);
    }

    @Override
    public void applybrakes(int decrease) {
        speed = speed  - decrease ;
        System.out.println(speed);
    }

    @Override
    public void speedUp(int increase) {
        speed = speed  + increase ;
        System.out.println(speed);
    }

}
