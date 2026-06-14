package j$.util;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5659k extends C5655g implements java.util.Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f84935b) {
            zEquals = this.f84934a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f84935b) {
            iHashCode = this.f84934a.hashCode();
        }
        return iHashCode;
    }
}
