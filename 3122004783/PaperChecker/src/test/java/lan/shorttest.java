package lan;

import lan.util.simhash;
import org.junit.Test;

public class shorttest {
    public shorttest() {
    }

    @Test
    public void shortStringExceptionTest() {
        System.out.println(simhash.getSimHash("一位真正的作家"));
    }
}
