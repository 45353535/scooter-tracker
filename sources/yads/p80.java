package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class p80 implements t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114579a;

    public p80(boolean z10) {
        this.f114579a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p80) && this.f114579a == ((p80) obj).f114579a;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f114579a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f114579a + ")";
    }
}
