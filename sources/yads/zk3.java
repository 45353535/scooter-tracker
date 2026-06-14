package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl3 f118732a;

    public /* synthetic */ zk3() {
        this(bl3.f109043e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk3) && this.f118732a == ((zk3) obj).f118732a;
    }

    public final int hashCode() {
        return this.f118732a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.f118732a + ")";
    }

    public zk3(bl3 bl3Var) {
        this.f118732a = bl3Var;
    }
}
