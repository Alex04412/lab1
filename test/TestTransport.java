import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestTransport {
    private Transport transport;
    private Saab95 saab;
    private Volvo240 volvo;
    @Before
    public void init(){
        transport = new Transport(2);
        saab = new Saab95();
        volvo = new Volvo240();
    }

    @Test
    public void testAddCardToLoad(){


        transport.addCarToLoad(saab);
        List<Cars> carLoad = transport.getCarLoad();
        transport.changeRamp();
        transport.addCarToLoad(volvo);
        transport.addCarToLoad(saab);
        transport.addCarToLoad(saab);

        assertTrue(carLoad.size()==2);
    }

}
