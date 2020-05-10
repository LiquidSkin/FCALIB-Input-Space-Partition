import de.tudresden.inf.tcs.fcaapi.change.ContextChange;
import de.tudresden.inf.tcs.fcalib.change.HistoryManager;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoryManagerTest extends TestCase {
        @Test
        public void elementAbsenceTest() {
            HistoryManager h = new HistoryManager();
            assertTrue(h.isEmpty());
        }

        @Test
        public void elementPresenceTest() {
            HistoryManager h = new HistoryManager();
            ContextChange<Integer> c = new ContextChange<Integer>() {
                @Override
                public void undo() {

                }

                @Override
                public int getType() {
                    return 0;
                }
            };
            h.add(c);
            assertTrue(!h.isEmpty());

        }

        @Test
        public void TestUndoLastPresence() {
            HistoryManager h = new HistoryManager();
            ContextChange<Integer> c1 = new ContextChange<Integer>() {
                @Override
                public void undo() {

                }

                @Override
                public int getType() {
                    return 0;
                }
            };
            ContextChange<Integer> c2 = new ContextChange<Integer>() {
                @Override
                public void undo() {

                }

                @Override
                public int getType() {
                    return 0;
                }
            };
            h.add(c1);
            h.add(c2);
            h.undoLast();
            assertTrue(!h.isEmpty());

        }

        @Test
        public void undoLastAbsence() {
            HistoryManager h = new HistoryManager();
            ContextChange<Integer> c2 = new ContextChange<Integer>() {
                @Override
                public void undo() {

                }

                @Override
                public int getType() {
                    return 0;
                }
            };
            h.push(c2);
            h.undoLast();
            assertTrue(h.isEmpty());
        }

    }
