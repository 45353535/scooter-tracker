package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f118930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118931b;

    public a0(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f118930a = bufferWithData;
        this.f118931b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        double[] dArr = this.f118930a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, kotlin.ranges.g.e(i10, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f118930a = dArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f118931b;
    }

    public final void e(double d10) {
        m2.c(this, 0, 1, null);
        double[] dArr = this.f118930a;
        int iD = d();
        this.f118931b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f118930a, d());
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
