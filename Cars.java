import java.awt.*;

public class Cars implements Movable{

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    protected double x;
    protected double y;

    protected int direction;

    protected Cars(int carNrDoors, double carEnginePower, Color carColor, String carModelName){
        nrDoors = carNrDoors;
        enginePower = carEnginePower;
        color = carColor;
        modelName = carModelName;


        stopEngine();
    }

     public int getNrDoors(){
        return nrDoors;
    }

    protected double getEnginePower(){
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
    public static void main(String[] args) {

    }

    @Override
    public void move() {
        if (direction%2==0) {
            if (direction==0){
                y=y+currentSpeed;
            }
            else {
                y=y-currentSpeed;
            }
        }
        else {
            if (direction==1){
                x=x+currentSpeed;
            }
            else {
                x=x-currentSpeed;
            }
        }

        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }

    @Override
    public void turnLeft() {
        direction= direction-1;
        if (direction<0){
            direction=direction+4;
        }

    }

    @Override
    public void turnRight() {
        direction= direction+1;
        if (direction>3){
            direction=direction-4;
        }
    }
}
