public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        double qualityCar = 0;
        double totalCars = speed * 221;
        if(speed < 5) {
            qualityCar = totalCars;
        }
        else if(speed < 9) {
            qualityCar = totalCars * 0.9;
        }
        else if(speed == 9) {
            qualityCar = totalCars * 0.8;
        }else {
            qualityCar = totalCars * 0.77;
        }
        return qualityCar;
    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        return (int) (productionRatePerHour(speed) / 60);
    }
}
