package pr3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMap implements Map {
    private static final Lock lock = new ReentrantLock();
    private HashMap anotherMap;
    private int num;
    private boolean bool;
    private Object obj;
    private Set set;
    private Collection col;

    public LockMap() {
        lock.lock();
        anotherMap = new HashMap();
        lock.unlock();
    }

    public LockMap(HashMap anotherMap) {
        lock.lock();
        this.anotherMap = anotherMap;
        lock.unlock();
    }

    @Override
    public int size() {
        lock.lock();
        num = anotherMap.size();
        lock.unlock();
        return num;

    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        bool = anotherMap.isEmpty();
        lock.unlock();
        return bool;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        bool = anotherMap.containsKey(key);
        lock.unlock();
        return bool;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        bool = anotherMap.containsKey(value);
        lock.unlock();
        return bool;
    }

    @Override
    public Object get(Object key) {
        lock.lock();
        obj = anotherMap.get(key);
        lock.unlock();
        return obj;
    }

    @Override
    public Object put(Object key, Object value) {
        lock.lock();
        obj = anotherMap.put(key, value);
        lock.unlock();
        return obj;
    }

    @Override
    public Object remove(Object key) {
        lock.lock();
        obj = anotherMap.remove(key);
        lock.unlock();
        return obj;
    }

    @Override
    public void putAll(Map m) {
        lock.lock();
        anotherMap.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        anotherMap.clear();
        lock.unlock();
    }

    @Override
    public Set keySet() {
        lock.lock();
        set = anotherMap.keySet();
        lock.unlock();
        return set;
    }

    @Override
    public Collection values() {
        lock.lock();
        col = anotherMap.values();
        lock.unlock();
        return col;
    }

    @Override
    public Set<Entry> entrySet() {
        lock.lock();
        set = anotherMap.entrySet();
        lock.unlock();
        return set;
    }
}
