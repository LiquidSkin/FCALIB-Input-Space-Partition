import de.tudresden.inf.tcs.fcalib.utils.ListSet;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListSetTest extends TestCase {
    @Test
    public void containsElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        assertTrue(li.contains(2));
    }

    @Test
    public void notContainsElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        assertFalse(li.contains(10));

    }
    @Test
    public void listSizeTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(10);
        li.add(20);
        assertTrue(li.size() > 1);
    }
    @Test
    public void emptyListTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        assertTrue(li.isEmpty());
    }
    @Test
    public void hasNextTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        Iterator<Integer> itr = li.iterator();
        assertTrue(itr.next() == 1);
    }
    @Test
    public void indexofElementTest()
    {
        ListSet<Integer> li = new ListSet<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        Integer index = li.getIndexOf(3);
        assertTrue(index == 2);

    }
}