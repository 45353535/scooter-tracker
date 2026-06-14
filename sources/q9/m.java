package q9;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f98811b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f98812c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f98813d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f98814e = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f98811b) {
            try {
                ArrayList arrayList = new ArrayList(this.f98814e);
                arrayList.add(obj);
                this.f98814e = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f98812c.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f98813d);
                    hashSet.add(obj);
                    this.f98813d = DesugarCollections.unmodifiableSet(hashSet);
                }
                this.f98812c.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        synchronized (this.f98811b) {
            try {
                Integer num = (Integer) this.f98812c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f98814e);
                arrayList.remove(obj);
                this.f98814e = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f98812c.remove(obj);
                    HashSet hashSet = new HashSet(this.f98813d);
                    hashSet.remove(obj);
                    this.f98813d = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f98812c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int count(Object obj) {
        int iIntValue;
        synchronized (this.f98811b) {
            try {
                iIntValue = this.f98812c.containsKey(obj) ? ((Integer) this.f98812c.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set elementSet() {
        Set set;
        synchronized (this.f98811b) {
            set = this.f98813d;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f98811b) {
            it = this.f98814e.iterator();
        }
        return it;
    }
}
