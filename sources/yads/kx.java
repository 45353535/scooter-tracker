package yads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class kx extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx f112882b;

    public kx(lx lxVar) {
        this.f112882b = lxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f112882b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        lx lxVar = this.f112882b;
        Map mapA = lxVar.a();
        return mapA != null ? mapA.values().iterator() : new fx(lxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f112882b.size();
    }
}
