package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69441d;

    public b8(int i10, int i11, int i12, int i13) {
        this.f69438a = i10;
        this.f69439b = i11;
        this.f69440c = i12;
        this.f69441d = i13;
    }

    public final int a() {
        return this.f69440c;
    }

    public final void b(int i10) {
        this.f69440c = i10;
    }

    public final int c() {
        return this.f69441d;
    }

    public final void d(int i10) {
        this.f69441d = i10;
    }

    public final int e() {
        return this.f69439b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return this.f69438a == b8Var.f69438a && this.f69439b == b8Var.f69439b && this.f69440c == b8Var.f69440c && this.f69441d == b8Var.f69441d;
    }

    public final void f(int i10) {
        this.f69439b = i10;
    }

    public final int g() {
        return this.f69438a;
    }

    public final void h(int i10) {
        this.f69438a = i10;
    }

    public int hashCode() {
        return (((((this.f69438a * 31) + this.f69439b) * 31) + this.f69440c) * 31) + this.f69441d;
    }

    public String toString() {
        return "ImpressionCounter(onVideoCompletedPlayCount=" + this.f69438a + ", onRewardedVideoCompletedPlayCount=" + this.f69439b + ", impressionNotifyDidCompleteAdPlayCount=" + this.f69440c + ", impressionSendVideoCompleteRequestPlayCount=" + this.f69441d + ")";
    }

    public /* synthetic */ b8(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 1 : i10, (i14 & 2) != 0 ? 1 : i11, (i14 & 4) != 0 ? 1 : i12, (i14 & 8) != 0 ? 1 : i13);
    }
}
