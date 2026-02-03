import java.awt.*;

public class Scania extends Truck{
    @Override
    public double speedFactor() {
        return 0;
    }

    public Scania(){
        super(2,280,0, Color.DARK_GRAY,"Scania",0,0,"NORTH");

    }
    private double angle;

    private double getAngle() {
        return angle;

    }

    protected void incAngle(int amount){
        if (angle+amount > 70 || angle+amount < 0) {
            throw new IllegalArgumentException("Can't reach that angle");
        }
         else{
            angle += amount;
            if (angle == 0) {
                isRampUp = false;
            }
            else {
                isRampUp = true;
            }

        }
    }
    protected void decAngle(int amount){
        if (angle-amount > 70 || angle-amount < 0) {
            throw new IllegalArgumentException("Can't reach that angle");
        }
        else{
            angle -= amount;
            if (angle == 0) {
                isRampUp = false;
            }
            else {
                isRampUp = true;
            }
        }
    }

}
