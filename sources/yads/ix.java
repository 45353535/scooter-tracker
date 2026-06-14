package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ix extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx f112176b;

    public ix(lx lxVar) {
        this.f112176b = lxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f112176b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f112176b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lx lxVar = this.f112176b;
        Map mapA = lxVar.a();
        return mapA != null ? mapA.keySet().iterator() : new dx(lxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapA = this.f112176b.a();
        return mapA != null ? mapA.keySet().remove(obj) : this.f112176b.b(obj) != lx.f113245k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f112176b.size();
    }
}
