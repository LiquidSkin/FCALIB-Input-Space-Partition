import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.ObjectDescription;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class AbstractContextTest {
    @Test
    public void abstractContextPresenceTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        String str = ac.getClass().toString();
        assertTrue(str.contains("AbstractContext"));
    }
    @Test
    public void presenceOfAttributesTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        ac.addAttribute("A sample attribute");
        ac.addAttribute("Another attribute");
        IndexedSet<String> set = ac.getAttributes();
        assertTrue(set.size() > 0);
    }
    @Test
    public void absenceOfAttributesTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        IndexedSet<String> set = ac.getAttributes();
        assertTrue(set.size() == 0);
    }
    @Test
    public void attributeCountSizeTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        assertTrue(ac.getAttributeCount() == 0);
    }
    @Test
    public void getObjectsTest() throws IllegalObjectException {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject ft = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public ObjectDescription getDescription() {
                return null;
            }

            @Override
            public boolean respects(FCAImplication implication) {
                return false;
            }
        };
        ac.addObject(ft);
        IndexedSet<FCAObject> set = new IndexedSet<FCAObject>() {
            @Override
            public int getIndexOf(FCAObject e) {
                return 0;
            }

            @Override
            public FCAObject getElementAt(int index) throws IndexOutOfBoundsException {
                return null;
            }

            @Override
            public void changeOrder() {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<FCAObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(FCAObject fcaObject) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends FCAObject> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        set = ac.getObjects();
        int count = 0;
        try {
            count =   ac.getObjectCount();
        }
        catch(Exception e)
        {

        }
        assertTrue(count == 0);
        assertTrue(set == null);
    }

}