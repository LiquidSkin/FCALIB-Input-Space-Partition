import de.tudresden.inf.tcs.fcalib.Implication;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class ImplicationTest extends TestCase {
    @Test
    public void testImplicationContainsElement() {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(4, 5, 6));
        Implication i = new Implication(set, set1);
        assertTrue(i == i);
        assertTrue(set.contains(1));

    }

    @Test
    public void testImplicationDoesNotContainsElement() {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Implication i = new Implication(set, set1);
        assertTrue(set.isEmpty());
        assertTrue(set1.isEmpty());

    }

    @Test
    public void presenceOfElementInPremiseAndConclusion() {
        Set<Integer> premise = new HashSet<Integer>(Arrays.asList(10, 20, 30));
        Set<Integer> conclusion = new HashSet<Integer>(Arrays.asList(100, 200, 300));
        Implication i = new Implication(premise, conclusion);
        assertTrue(premise.contains(20) && conclusion.contains(100));
    }

    @Test
    public void firstElementInPremiseAndConclusion() {
        Set<String> premise = new LinkedHashSet<String>(Arrays.asList("the", "fox", "is", "here"));
        Set<String> conclusion = new LinkedHashSet<String>(Arrays.asList("I", "am", "here", "just"));
        Implication i = new Implication(premise, conclusion);
        Iterator<String> itr = premise.iterator();
        Iterator<String> itr1 = conclusion.iterator();
        assertTrue(itr.next() == "the");
        assertTrue(itr1.next() == "I");


    }
}