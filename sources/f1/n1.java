package f1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f70512g;

    public n1(boolean z10, boolean z11, int i10, int i11, long j10, int i12, List list) {
        this.f70506a = z10;
        this.f70507b = z11;
        this.f70508c = i10;
        this.f70509d = i11;
        this.f70510e = j10;
        this.f70511f = i12;
        this.f70512g = list;
    }

    public final int a() {
        return this.f70508c;
    }

    public final int b() {
        return this.f70509d;
    }

    public final int c() {
        return this.f70511f;
    }

    public final boolean d() {
        return this.f70507b;
    }

    public final List e() {
        return this.f70512g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f70506a == n1Var.f70506a && this.f70507b == n1Var.f70507b && this.f70508c == n1Var.f70508c && this.f70509d == n1Var.f70509d && this.f70510e == n1Var.f70510e && this.f70511f == n1Var.f70511f && Intrinsics.areEqual(this.f70512g, n1Var.f70512g);
    }

    public final long f() {
        return this.f70510e;
    }

    public final boolean g() {
        return this.f70506a;
    }

    public int hashCode() {
        int iA = ((((((((((androidx.compose.foundation.c.a(this.f70506a) * 31) + androidx.compose.foundation.c.a(this.f70507b)) * 31) + this.f70508c) * 31) + this.f70509d) * 31) + androidx.collection.b.a(this.f70510e)) * 31) + this.f70511f) * 31;
        List list = this.f70512g;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "OmSdkModel(isEnabled=" + this.f70506a + ", verificationEnabled=" + this.f70507b + ", minVisibleDips=" + this.f70508c + ", minVisibleDurationMs=" + this.f70509d + ", visibilityCheckIntervalMs=" + this.f70510e + ", traversalLimit=" + this.f70511f + ", verificationList=" + this.f70512g + ")";
    }

    public /* synthetic */ n1(boolean z10, boolean z11, int i10, int i11, long j10, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? 1 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 100L : j10, (i13 & 32) != 0 ? 25 : i12, (i13 & 64) != 0 ? null : list);
    }
}
