import de.tudresden.inf.tcs.fcalib.FullObject;
import de.tudresden.inf.tcs.fcalib.FullObjectDescription;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class FullObjectTest {

    @Test
    public void fullObjectPresenceTest()
    {
        FullObjectDescription desc = new FullObjectDescription();
        int id = 1;
        FullObject f = new FullObject(1);
        Object obj = f.getIdentifier();
        int res = (Integer) obj;
        assertTrue(res == 1);
    }
    @Test
    public void fullObjectPresenceWithAttributes()
    {
        HashSet<Object> set = new HashSet<Object>();
        set.add("sampleName");
        set.add("This is a sample description");
        int id = 1;
        FullObject f = new FullObject(1,set);
        Object description = f.getDescription();
        assertTrue(f.getDescription()== description);
    }

    @Test
    public void nameTest()
    {
        FullObject f = new FullObject(1);
        f.setName("Halliburton");
        assertTrue(f.getName()== "Halliburton");


    }


}