import de.tudresden.inf.tcs.fcalib.PartialObjectDescription;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PartialObjectDescriptionTest {
    public void partialObjectAttributeAbsenceTest()
    {
        Set<Integer> set = new HashSet<Integer>();
        PartialObjectDescription p = new PartialObjectDescription();
        assertTrue(!p.containsAttribute(set));

    }
    @Test
    public void partialObjectAtributePresenceTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addAttribute(set);
        assertTrue(p.containsAttribute(set));
    }
    @Test
    public void elementPresenceNegatedAttributeTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1000,2000,3000,4000));
        PartialObjectDescription p = new PartialObjectDescription();
        p.addNegatedAttribute(set);
        assertTrue(p.containsNegatedAttribute(set) && set.contains(200));

    }
    @Test
    public void elementAbsenceNegatedAttributeTest()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        assertTrue(!p.containsNegatedAttribute(set) && !set1.contains(300));
    }
    @Test
    public void  elementPresenceAttributes()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        Set<HashSet> sets = new HashSet<HashSet>();
        sets.add((HashSet) set1);
        sets.add((HashSet) set);
        p.addAttributes(sets);
        assertTrue(p.containsAttributes(sets));
    }

    @Test
    public void elementAbsenceAttributes()
    {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(100,200,300,400,500));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2000,4000,6000));
        PartialObjectDescription p = new PartialObjectDescription();
        Set<HashSet> sets = new HashSet<HashSet>();
        sets.add((HashSet) set1);
        sets.add((HashSet) set);
        assertTrue(!p.containsAttributes(sets));
    }

}