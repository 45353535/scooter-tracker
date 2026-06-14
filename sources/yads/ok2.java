package yads;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ok2 extends y31 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2 f114347d;

    public ok2(pk2 pk2Var) {
        this.f114347d = pk2Var;
    }

    @Override // yads.s31
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ie2.a(i10, this.f114347d.f114695g);
        pk2 pk2Var = this.f114347d;
        int i11 = i10 * 2;
        Object obj = pk2Var.f114693e[pk2Var.f114694f + i11];
        Objects.requireNonNull(obj);
        pk2 pk2Var2 = this.f114347d;
        Object obj2 = pk2Var2.f114693e[i11 + (pk2Var2.f114694f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f114347d.f114695g;
    }
}
