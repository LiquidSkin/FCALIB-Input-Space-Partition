import de.tudresden.inf.tcs.fcalib.PartialObject;
import de.tudresden.inf.tcs.fcalib.PartialObjectDescription;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class PartialObjectTest {
    @Test
    public void PartialObjectPresenceTestWithIdentifier()
    {
        int id = 1;
        PartialObject p = new PartialObject(id);
        Object res = p.getIdentifier();
        int i = (Integer) res;
        assertTrue(i == 1);

    }
    @Test
    public void PartialObjectPresenceWithIdentifiers()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        PartialObjectDescription<String> pt1 = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        HashSet<PartialObjectDescription> set1 = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");

        pt1.addNegatedAttribute("Negative attribute");
        pt1.addNegatedAttribute("Small Negated Attribute");

        set.add(pt);

        int id = 10;
        PartialObject p = new PartialObject(id,set);
        assertTrue(set.contains(pt));

    }
    @Test
    public void partialObjectPresenceWithNegatedAttributes()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        PartialObjectDescription<String> pt1 = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        HashSet<PartialObjectDescription> set1 = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");

        pt1.addNegatedAttribute("Negative attribute");
        pt1.addNegatedAttribute("Small Negated Attribute");
        set.add(pt);
        set1.add(pt1);
        int id = 10;
        PartialObject p = new PartialObject(id,set,set1);
        assertTrue(set1.contains(pt1));


    }

    @Test
    public void AttributeNamePresenceTest()
    {
        int id = 1;
        PartialObject p = new PartialObject(id);
        p.setName("SampleAttribute");
        String res = p.getName();
        assertTrue(res.equals("SampleAttribute"));
    }
    @Test
    public void AttributeDescriptorTest()
    {
        PartialObjectDescription<String> pt = new PartialObjectDescription<String>();
        HashSet<PartialObjectDescription> set = new HashSet<PartialObjectDescription>();
        pt.addAttribute("Soft and Smooth");
        pt.addAttribute("Haste and Waste");
        set.add(pt);
        int id = 10;
        PartialObject p = new PartialObject(id,set);
        Object ob = p.getDescription();
        String res = ob.toString();
        assertTrue(res.contains("Haste and Waste"));

    }

}