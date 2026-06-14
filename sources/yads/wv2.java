package yads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class wv2 extends vv2 implements SortedSet {
    public wv2(SortedSet sortedSet, je2 je2Var) {
        super(sortedSet, je2Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f117211b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f117211b.iterator();
        je2 je2Var = this.f117212c;
        it.getClass();
        je2Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (je2Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new wv2(((SortedSet) this.f117211b).headSet(obj), this.f117212c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f117211b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f117212c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new wv2(((SortedSet) this.f117211b).subSet(obj, obj2), this.f117212c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new wv2(((SortedSet) this.f117211b).tailSet(obj), this.f117212c);
    }
}
