package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f119087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119088b;

    public v2(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119087a = bufferWithData;
        this.f119088b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        short[] sArr = this.f119087a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, kotlin.ranges.g.e(i10, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f119087a = sArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119088b;
    }

    public final void e(short s10) {
        m2.c(this, 0, 1, null);
        short[] sArr = this.f119087a;
        int iD = d();
        this.f119088b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f119087a, d());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
