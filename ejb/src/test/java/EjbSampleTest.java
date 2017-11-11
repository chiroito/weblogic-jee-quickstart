import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EjbSampleTest {

    @Test
    public void add() throws Exception {
        EjbSample sample = new EjbSample();
        assertThat(sample.add(1, 2), is(3));
    }

}