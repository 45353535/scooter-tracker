package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ai1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108694b;

    public ai1(String str, float f10) {
        this.f108693a = str;
        this.f108694b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai1)) {
            return false;
        }
        ai1 ai1Var = (ai1) obj;
        return Intrinsics.areEqual(this.f108693a, ai1Var.f108693a) && Float.compare(this.f108694b, ai1Var.f108694b) == 0;
    }

    public final int hashCode() {
        String str = this.f108693a;
        return Float.floatToIntBits(this.f108694b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f108693a + ", aspectRatio=" + this.f108694b + ")";
    }
}
