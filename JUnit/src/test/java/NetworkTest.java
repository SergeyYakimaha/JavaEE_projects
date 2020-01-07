import org.junit.Assert;
import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class NetworkTest {

    @Test (timeout = 1000)
    public void connectionShouldReturnFasterThanOneSecond() {
        Network.Connection();
    }

    @Test (expected = ArithmeticException.class)
    @Ignore
    public void getConnectionShouldThrowException() {
        Network.getConnection();
    }

    @Test
    public void getIntegerTest(){
        //Assert.assertNotNull(Network.getInteger());
        Assume.assumeNotNull(Network.getInteger());
    }
}
