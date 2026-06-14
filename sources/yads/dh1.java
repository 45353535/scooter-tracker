package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dh1 extends xv2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f109924b;

    public dh1(Map map) {
        this.f109924b = (Map) ie2.a(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f109924b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f109924b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f109924b.size();
    }
}
