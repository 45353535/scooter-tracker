package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f118968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118969b;

    public g(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f118968a = bufferWithData;
        this.f118969b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        boolean[] zArr = this.f118968a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, kotlin.ranges.g.e(i10, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f118968a = zArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f118969b;
    }

    public final void e(boolean z10) {
        m2.c(this, 0, 1, null);
        boolean[] zArr = this.f118968a;
        int iD = d();
        this.f118969b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f118968a, d());
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
