package HW4.Airport;

public class Airplane implements Nameable {
    public static int countAirplaneinoperation = 0;
    public static int countAirplane = 0;
    public final String brand;
    private String speed;
    private String carrying_capacity;

    public String pilot;
    private boolean isReserved;

    public Airplane(String brand) {
        this.brand = brand;
        countAirplane++;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(String carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    public static String getStatistic(Airplane pilot) {
        return ("Number of airplane in operation: " + countAirplaneinoperation + "\n" + "The number of planes at the airport: " + countAirplane);
    }

    public void reserve(Pilot pilot){
        incrementCounter();
        this.pilot = pilot.getFirst_name() + pilot.getLast_name();
        this.isReserved = true;
    }

    private void incrementCounter() {
        countAirplaneinoperation++;
    }

    public void act(Pilot pilot) {
        System.out.println("Hello Command and control post");
    }

    public void act(Commandpost commandpost) {
        System.out.println("Hello pilot");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                ", speed='" + speed + '\'' +
                ", carrying_capacity='" + carrying_capacity + '\'' +
                ", pilot=" + pilot +
                ", isReserved=" + isReserved +
                '}';
    }
}
