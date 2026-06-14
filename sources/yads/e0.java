package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 implements xv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f110121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient q f110122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient d0 f110123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f110124e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xv1) {
            return ((i) this).a().equals(((i) ((xv1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f113665d.hashCode();
    }

    public final String toString() {
        return a().f113665d.toString();
    }
}
