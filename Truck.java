import java.awt.*;

public abstract class Truck extends Car{
    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double xPos, double yPos, String direction){
        super(nrDoors,enginePower,currentSpeed,color,modelName,xPos,yPos,direction);

    }
    protected boolean isRampUp = false;

    protected boolean moveIng(){
         if (getCurrentSpeed() > 0 && isRampUp){

         }
    }
}
