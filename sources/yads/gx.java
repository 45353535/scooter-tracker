package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gx extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx f111375b;

    public gx(lx lxVar) {
        this.f111375b = lxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f111375b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapA = this.f111375b.a();
        if (mapA != null) {
            return mapA.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA = this.f111375b.a(entry.getKey());
            if (iA != -1 && y72.a(this.f111375b.c(iA), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lx lxVar = this.f111375b;
        Map mapA = lxVar.a();
        return mapA != null ? mapA.entrySet().iterator() : new ex(lxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        int iA;
        Map mapA = this.f111375b.a();
        if (mapA != null) {
            return mapA.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f111375b.c() || (iA = mx.a(entry.getKey(), entry.getValue(), (1 << (this.f111375b.f113250f & 31)) - 1, this.f111375b.f(), this.f111375b.d(), this.f111375b.e(), this.f111375b.g())) == -1) {
            return false;
        }
        this.f111375b.a(iA, i10);
        lx lxVar = this.f111375b;
        lxVar.f113251g--;
        lxVar.f113250f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f111375b.size();
    }
}
