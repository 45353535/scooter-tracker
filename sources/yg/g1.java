package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f118972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118973b;

    public g1(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f118972a = bufferWithData;
        this.f118973b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        long[] jArr = this.f118972a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, kotlin.ranges.g.e(i10, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f118972a = jArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f118973b;
    }

    public final void e(long j10) {
        m2.c(this, 0, 1, null);
        long[] jArr = this.f118972a;
        int iD = d();
        this.f118973b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f118972a, d());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
