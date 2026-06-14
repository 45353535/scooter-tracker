package yads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gc1 {
    public static Object a(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }
}
