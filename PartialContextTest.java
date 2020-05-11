import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcalib.PartialContext;
import de.tudresden.inf.tcs.fcalib.PartialObject;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class PartialContextTest {
    @Test
    public void partialContextAbsenceTest()
    {
        PartialContext pt = new PartialContext();
        HashSet set = new HashSet();
        assertTrue(!pt.containsObject(set));
    }
    @Test
    public void partialContextPresenceTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        assertTrue(pt.containsObject(1));
    }
    @Test
    public void getObjectNotPresentAtIndex()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        Object obj = pt.getObjectAtIndex(0);
        assertTrue(obj.toString().contains("1"));
    }
    @Test
    public void getObjectCountAbsenceTest()
    {
        PartialContext pt = new PartialContext();
        int count = pt.getObjectCount();
        assertTrue(count == 0);
    }
    @Test
    public void getObjectCountPresenceTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        int count = pt.getObjectCount();
        assertTrue(count == 1);
    }
    @Test
    public void removeObjectNotPresentTest() throws IllegalObjectException {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(5);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == false);
    }
    @Test
    public void removeObjectPresentTest() throws IllegalObjectException {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(1);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == true);
    }

}