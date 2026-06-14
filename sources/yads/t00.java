package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class t00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f116004a;

    public t00(float f10) {
        this.f116004a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t00) && Float.compare(this.f116004a, ((t00) obj).f116004a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f116004a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f116004a + ")";
    }
}
