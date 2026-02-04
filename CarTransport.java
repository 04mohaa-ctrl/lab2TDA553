import java.awt.*;
import java.util.ArrayList;
import static java.lang.Math.abs;
public class CarTransport extends Truck {
    @Override
    public double speedFactor() {
        return 0;
    }
    public CarTransport() {
        super(2, 380, 0, Color.blue, "CarTransport", 0, 0, "NORTH");
    }
    ArrayList<Car> carList = new ArrayList<>(5);
    private void raiseRamp() {
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("The transport is moving");
        } else {
            isRampUp = true;
        }
    }

    private void lowerRamp() {
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("The transport is moving");
        } else {
            isRampUp = false;
        }
    }
    @Override
    public void move() {
        super.move();
        for (Car car : carList) {
            car.setDirection(getDirection());
            car.setxPos(getX());
            car.setyPos(getY());
        }
    }
    @Override
    public void turnLeft() {
        super.move();
        for (Car car : carList) {
            car.setDirection(getDirection());
        }
    }
    @Override
    public void turnRight() {
    super.move();
        for(Car car :carList) {
        car.setDirection(getDirection());
        }
    }
    private void load(Car cars){
        double X = abs(getX()- cars.getX());
        double Y = abs(getY()- cars.getY());
        if(X <= 2 && Y <= 2 && X >= 1 && Y >= 1 && !isRampUp && carList.toArray().length < 5 || cars instanceof CarTransport || cars.getEnginePower()> 500){
            carList.add(cars);
        }
        cars.stopEngine();
        cars.setDirection(getDirection());
        cars.setxPos(getX());
        cars.setyPos(getY());
    }
    private void unLoad(Car cars) {
        if (!isRampUp && carList.get(-1) == cars) {
            carList.remove(-1);
            cars.stopEngine();
            cars.setDirection(getDirection());
            cars.setxPos(getX() + 1);
            cars.setyPos(getY() + 1);
        }

    }



}
