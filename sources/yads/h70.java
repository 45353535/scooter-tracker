package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class h70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111502a;

    public h70(boolean z10) {
        this.f111502a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h70) && this.f111502a == ((h70) obj).f111502a;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f111502a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f111502a + ")";
    }
}
