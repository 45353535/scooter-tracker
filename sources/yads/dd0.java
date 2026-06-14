package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class dd0 extends aw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f109884b;

    public dd0(Map map) {
        this.f109884b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f109884b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = (Iterator) ie2.a(((vw) entrySet()).iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.aw0, java.util.Map
    public final Set entrySet() {
        return yv2.a(super.entrySet(), new je2() { // from class: yads.f6
            @Override // yads.je2
            public final boolean apply(Object obj) {
                return dd0.a((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((vv2) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f109884b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return yv2.a(entrySet());
    }

    @Override // yads.aw0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && this.f109884b.containsKey(null));
    }

    @Override // yads.aw0, java.util.Map
    public final Set keySet() {
        return yv2.a(super.keySet(), new je2() { // from class: yads.e6
            @Override // yads.je2
            public final boolean apply(Object obj) {
                return dd0.a((String) obj);
            }
        });
    }

    @Override // yads.aw0, java.util.Map
    public final int size() {
        return super.size() - (this.f109884b.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }
}
