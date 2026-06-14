package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class pk2 extends d41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient b41 f114692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f114693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f114694f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f114695g;

    public pk2(b41 b41Var, Object[] objArr, int i10) {
        this.f114692d = b41Var;
        this.f114693e = objArr;
        this.f114695g = i10;
    }

    @Override // yads.s31
    public final int a(int i10, Object[] objArr) {
        return a().a(i10, objArr);
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f114692d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.s31
    public final boolean e() {
        return true;
    }

    @Override // yads.d41
    public final y31 f() {
        return new ok2(this);
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final w73 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f114695g;
    }
}
