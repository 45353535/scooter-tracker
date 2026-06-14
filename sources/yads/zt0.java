package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zt0 implements mx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx2 f118812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118815d;

    public zt0(int i10, int i11, lx2 lx2Var) {
        this.f118812a = lx2Var;
        this.f118813b = (i10 >= 0 || -1 == i10) ? i10 : 0;
        this.f118814c = (i11 >= 0 || -2 == i11) ? i11 : 0;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f118815d = str;
    }

    @Override // yads.mx2
    public final int a(Context context) {
        int i10 = this.f118814c;
        return -2 == i10 ? qi3.b(context) : i10;
    }

    @Override // yads.mx2
    public final int c(Context context) {
        int i10 = this.f118813b;
        return -1 == i10 ? qi3.d(context) : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(zt0.class, obj.getClass())) {
            zt0 zt0Var = (zt0) obj;
            if (this.f118813b == zt0Var.f118813b && this.f118814c == zt0Var.f118814c && this.f118812a == zt0Var.f118812a) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.mx2
    public final int getHeight() {
        return this.f118814c;
    }

    @Override // yads.mx2
    public final int getWidth() {
        return this.f118813b;
    }

    public final int hashCode() {
        return this.f118812a.hashCode() + j4.a(this.f118815d, ((this.f118813b * 31) + this.f118814c) * 31, 31);
    }

    public final String toString() {
        return this.f118815d;
    }

    @Override // yads.mx2
    public final lx2 a() {
        return this.f118812a;
    }
}
