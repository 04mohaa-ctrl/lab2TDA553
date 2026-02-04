import java.awt.*;

public abstract class Truck extends Car{
    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double xPos, double yPos, String direction){
        super(nrDoors,enginePower,currentSpeed,color,modelName,xPos,yPos,direction);

    }

    protected boolean isRampUp = false;
    @Override
    public void move(){
        if (isRampUp){
            throw new IllegalArgumentException("Cant drive with ramp up");
        }
        else{
            super.move();
        }
    }
    public boolean isMoving(){
        return getCurrentSpeed() > 0;
    }
    @Override
    public void startEngine() {
        if (isRampUp) {
            throw new IllegalArgumentException("Cant drive with ramp up");
        } else {
            super.startEngine();
        }
    }
    @Override
    public void incrementSpeed(double amount){
        if (isRampUp){
            throw new IllegalArgumentException("Can't increase speed while the flak is up");
        }
        else{
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
        }
    }

}
