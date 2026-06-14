package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f118628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ou0 f118629b = new ou0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f118631d;

    public zd1(Object obj) {
        this.f118628a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zd1.class != obj.getClass()) {
            return false;
        }
        return this.f118628a.equals(((zd1) obj).f118628a);
    }

    public final int hashCode() {
        return this.f118628a.hashCode();
    }
}
