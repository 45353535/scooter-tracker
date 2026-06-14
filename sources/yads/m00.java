package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f113281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113284d;

    public m00(sy1 sy1Var, String str, int i10, int i11) {
        this.f113281a = sy1Var;
        this.f113282b = str;
        this.f113283c = i10;
        this.f113284d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return Intrinsics.areEqual(this.f113281a, m00Var.f113281a) && Intrinsics.areEqual(this.f113282b, m00Var.f113282b) && this.f113283c == m00Var.f113283c && this.f113284d == m00Var.f113284d;
    }

    public final int hashCode() {
        int iHashCode = this.f113281a.hashCode() * 31;
        String str = this.f113282b;
        return this.f113284d + bb3.a(this.f113283c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f113281a + ", sizeType=" + this.f113282b + ", width=" + this.f113283c + ", height=" + this.f113284d + ")";
    }
}
