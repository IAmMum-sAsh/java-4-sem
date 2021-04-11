package pr3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet implements Set {
    private HashSet anotherSet;

    public SynchronizedSet() {
        anotherSet = new HashSet();
    }

    public SynchronizedSet(HashSet anotherSet) {
        this.anotherSet = anotherSet;
    }

    @Override
    synchronized public int size() {
        return anotherSet.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return anotherSet.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return anotherSet.contains(o);
    }

    @Override
    synchronized public Iterator iterator() {
        return anotherSet.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return anotherSet.toArray();
    }

    @Override
    synchronized public boolean add(Object o) {
        return anotherSet.add(o);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return anotherSet.remove(o);
    }

    @Override
    synchronized public boolean addAll(Collection c) {
        return anotherSet.addAll(c);
    }

    @Override
    synchronized public void clear() {
        anotherSet.clear();
    }

    @Override
    synchronized public boolean removeAll(Collection c) {
        return anotherSet.removeAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection c) {
        return anotherSet.retainAll(c);
    }

    @Override
    synchronized public boolean containsAll(Collection c) {
        return anotherSet.containsAll(c);
    }

    @Override
    synchronized public Object[] toArray(Object[] a) {
        return anotherSet.toArray(a);
    }
}
