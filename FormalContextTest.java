import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.FormalContext;
import de.tudresden.inf.tcs.fcalib.FullObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormalContextTest {
    @Test
    public void FormalContextPresence()
    {
        FormalContext f = new FormalContext();
        String res = f.getClass().toString();
        assertTrue(res.contains("FormalContext"));
    }
    @Test
    public void objectPresenceTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        FullObject f = new FullObject(id);
        s.addObject(f);
        try
        {
            s.addObject(f);
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));

    }
    @Test
    public void getObjectsTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        FullObject f = new FullObject(id);
        s.addObject(f);
        try
        {
            IndexedSet<FCAObject> set = s.getObjects();
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
    @Test
    public void objectIndexTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            Object obj  = s.getObjectAtIndex(0);
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
    @Test
    public void objectRemovalTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.removeObject(1);
            s.removeObject(1);
        }
        catch(Exception e)
        {

        }
        assertTrue(!s.containsObject(1));
    }

}