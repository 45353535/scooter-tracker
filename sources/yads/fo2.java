package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class fo2 extends f92 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f92 f110816b;

    public fo2(f92 f92Var) {
        this.f110816b = (f92) ie2.a(f92Var);
    }

    @Override // yads.f92
    public final f92 a() {
        return this.f110816b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f110816b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fo2) {
            return this.f110816b.equals(((fo2) obj).f110816b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f110816b.hashCode();
    }

    public final String toString() {
        return this.f110816b + ".reverse()";
    }
}
