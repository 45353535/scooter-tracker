package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112273b;

    public ja(int i10, int i11) {
        this.f112272a = i10;
        this.f112273b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return this.f112272a == jaVar.f112272a && this.f112273b == jaVar.f112273b;
    }

    public final int hashCode() {
        return this.f112273b + (this.f112272a * 31);
    }

    public final String toString() {
        return "AdSize(width=" + this.f112272a + ", height=" + this.f112273b + ")";
    }
}
