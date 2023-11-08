import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
public class Tests {
    private Cars car;
    @Before
    public void init(){

        car = new Cars(2,240, Color.red,"Peugeot206");
    }
    @Test
    public void testStartEngine(){
        car.startEngine();
        double speed=car.getCurrentSpeed();
        assertTrue(speed==0.1);
    }

    @Test
    public void testStopEngine(){
        car.startEngine();
        car.stopEngine();
        double speed=car.getCurrentSpeed();
        assertTrue(speed==0);
    }

    @Test
    public void testGetNrDoors(){
        int doors=car.getNrDoors();
        assertTrue(doors==2);
    }

    @Test
    public void testGetSetColor(){
        Color color = car.getColor();
        assertTrue(color == Color.red);
    }

    @Test
    public void testGetEnginePower(){
        double enginePower=car.getEnginePower();
        assertTrue(240 == enginePower);
    }

}
