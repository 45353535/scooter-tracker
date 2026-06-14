package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class nw extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114062a;

    public nw(boolean z10) {
        super(0);
        this.f114062a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw) && this.f114062a == ((nw) obj).f114062a;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f114062a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.f114062a + ")";
    }
}
