import java.awt.*;

import static java.lang.Math.abs;

public class CarTransport extends Car{
    @Override
    public double speedFactor() {
        return 0;
    }
    public CarTransport(){
        super(2,380,0, Color.blue,"CarTransport",0,0,"NORTH");

    }
    private boolean isRampUp = false;
    private void raiseRamp(){
        if (getCurrentSpeed() != 0){
            throw new IllegalArgumentException("The transport is moving");
        }
        else {
            isRampUp = true;
        }
    }
    private void lowerRamp(){
        if (getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("The transport is moving");
        }
        else {
            isRampUp = false;
        }
    }
    private void load(Car other){
        double loadSize = 10;
        double X = abs(getX()- other.getX());
        double Y = abs(getY()- other.getY());
        if(X <= 2 && Y <= 2 && X >= 1 && Y >= 1){
            loadSize -= 1;

        }
    }
}
