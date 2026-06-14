package yads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 extends e0 implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f108502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f108503g;

    public a0(Map map) {
        ie2.a(map.isEmpty());
        this.f108502f = map;
    }

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final n b() {
        Map map = this.f108502f;
        return map instanceof NavigableMap ? new r(this, (NavigableMap) this.f108502f) : map instanceof SortedMap ? new u(this, (SortedMap) this.f108502f) : new n(this, this.f108502f);
    }

    public final q c() {
        Map map = this.f108502f;
        return map instanceof NavigableMap ? new s(this, (NavigableMap) this.f108502f) : map instanceof SortedMap ? new v(this, (SortedMap) this.f108502f) : new q(this, this.f108502f);
    }
}
