package yg;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f119009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119010b;

    public /* synthetic */ j3(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // yg.m2
    public /* bridge */ /* synthetic */ Object a() {
        return lf.u.a(f());
    }

    @Override // yg.m2
    public void b(int i10) {
        if (lf.u.n(this.f119009a) < i10) {
            int[] iArr = this.f119009a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, kotlin.ranges.g.e(i10, lf.u.n(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f119009a = lf.u.f(iArrCopyOf);
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119010b;
    }

    public final void e(int i10) {
        m2.c(this, 0, 1, null);
        int[] iArr = this.f119009a;
        int iD = d();
        this.f119010b = iD + 1;
        lf.u.r(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f119009a, d());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return lf.u.f(iArrCopyOf);
    }

    private j3(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119009a = bufferWithData;
        this.f119010b = lf.u.n(bufferWithData);
        b(10);
    }
}
