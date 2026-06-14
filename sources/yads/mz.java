package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class mz implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113658b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f113659c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f113660d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f113661e = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f113658b) {
            try {
                iIntValue = this.f113659c.containsKey(obj) ? ((Integer) this.f113659c.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f113658b) {
            try {
                Integer num = (Integer) this.f113659c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f113661e);
                arrayList.remove(obj);
                this.f113661e = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f113659c.remove(obj);
                    HashSet hashSet = new HashSet(this.f113660d);
                    hashSet.remove(obj);
                    this.f113660d = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f113659c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f113658b) {
            it = this.f113661e.iterator();
        }
        return it;
    }
}
