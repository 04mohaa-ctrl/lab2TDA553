import java.awt.*;

public class Scania extends Car{
    @Override
    public double speedFactor() {
        return 0;
    }

    public Scania(){
        super(2,280,0, Color.DARK_GRAY,"Scania",0,0,"NORTH");

    }
    private double angle;
    @Override
    public void incrementSpeed(double amount){
        if (angle != 0){
            throw new IllegalArgumentException("Can't increase speed while the flak is up");
        }
        else{
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
        }
    }
    @Override
    public void startEngine(){
        if (angle != 0){
            throw new IllegalArgumentException("Can't increase speed while the flak is up");
        }
        else {
            setCurrentSpeed(0.1);
        }
    }
    private void getAngle() {
        if (angle > 70 || angle < 0) {
            System.out.println("The angle is out of range");
        } else if (getCurrentSpeed() > 0) {
            System.out.println("The angle is " + angle);
        }

    }
    private void incAngle(int amount){
        if (angle+amount > 70 || angle+amount < 0) {
            throw new IllegalArgumentException("Can't reach that angle");
        }
        else{
            angle += amount;
        }
    }
    private void decAngle(int amount){
        if (angle-amount > 70 || angle-amount < 0) {
            throw new IllegalArgumentException("Can't reach that angle");
        }
        else{
            angle -= amount;
        }
    }

}
