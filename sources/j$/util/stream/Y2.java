package j$.util.stream;

import j$.util.C5654f;
import j$.util.stream.Collector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y2 {
    public static Set a(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof Collector.Characteristics) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e10) {
                    C5654f.a("java.util.stream.Collector.Characteristics", e10);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C5654f.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics2 == null ? null : characteristics2 == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics2 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e11) {
                    C5654f.a("java.util.stream.Collector.Characteristics", e11);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
