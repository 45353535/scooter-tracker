package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118872a;

    public zy0(boolean z10) {
        this.f118872a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy0) && this.f118872a == ((zy0) obj).f118872a;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f118872a);
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f118872a + ")";
    }
}
