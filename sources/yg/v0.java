package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f119083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119084b;

    public v0(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119083a = bufferWithData;
        this.f119084b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        int[] iArr = this.f119083a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, kotlin.ranges.g.e(i10, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f119083a = iArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119084b;
    }

    public final void e(int i10) {
        m2.c(this, 0, 1, null);
        int[] iArr = this.f119083a;
        int iD = d();
        this.f119084b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f119083a, d());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
