import java.awt.*;


public class Car implements Movable{
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName;
    double xPos = 0;
    double yPos = 0;
    public double getY(){
        return this.yPos;
    }
    public double getX(){
        return this.xPos;
    }
    String direction = "NORTH";
    public void move(){
    switch (direction){
        case "NORTH":
            yPos += this.currentSpeed;
            break;
        case "WEST":
            xPos -= this.currentSpeed;
            break;
        case "SOUTH":
            yPos -= this.currentSpeed;
            break;
        case "EAST":
            xPos += this.currentSpeed;
            break;
        }

    }
    public void turnLeft(){
    switch (direction){
        case "NORTH":
            direction = "WEST";
            break;
        case "WEST":
            direction = "SOUTH";
            break;
        case "SOUTH":
            direction = "EAST";
            break;
        case "EAST":
            direction = "NORT";
            break;

    }

    }
    public void turnRight(){
        switch (direction) {
            case "NORTH":
                direction = "EAST";
                break;
            case "WEST":
                direction = "NORTH";
                break;
            case "SOUTH":
                direction = "WEST";
                break;
            case "EAST":
                direction = "SOUTH";
                break;
        }

    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }
}
