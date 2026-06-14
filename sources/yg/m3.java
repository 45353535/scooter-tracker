package yg;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f119033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119034b;

    public /* synthetic */ m3(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // yg.m2
    public /* bridge */ /* synthetic */ Object a() {
        return lf.w.a(f());
    }

    @Override // yg.m2
    public void b(int i10) {
        if (lf.w.n(this.f119033a) < i10) {
            long[] jArr = this.f119033a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, kotlin.ranges.g.e(i10, lf.w.n(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f119033a = lf.w.f(jArrCopyOf);
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119034b;
    }

    public final void e(long j10) {
        m2.c(this, 0, 1, null);
        long[] jArr = this.f119033a;
        int iD = d();
        this.f119034b = iD + 1;
        lf.w.r(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f119033a, d());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return lf.w.f(jArrCopyOf);
    }

    private m3(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119033a = bufferWithData;
        this.f119034b = lf.w.n(bufferWithData);
        b(10);
    }
}
