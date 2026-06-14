package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hl2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hl2 f111630b = new hl2(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111631a;

    public hl2(boolean z10) {
        this.f111631a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hl2.class == obj.getClass() && this.f111631a == ((hl2) obj).f111631a;
    }

    public final int hashCode() {
        return !this.f111631a ? 1 : 0;
    }
}
