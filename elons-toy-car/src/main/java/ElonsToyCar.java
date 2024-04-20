public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) ElonsToyCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the ElonsToyCar.distanceDisplay()  method");
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the ElonsToyCar.batteryDisplay()  method");
        if(battery <= 0)  return "Battery empty";

        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery > 0) {
            distance += 20;
            battery--;
        } else {
            batteryDisplay();
        }

    }
}
