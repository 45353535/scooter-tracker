package j$.util;

/* JADX INFO: renamed from: j$.util.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5797u extends C5661m implements java.util.Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f84955a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f84955a.hashCode();
    }
}
