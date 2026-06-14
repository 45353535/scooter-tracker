package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f119012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119013b;

    public k0(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119012a = bufferWithData;
        this.f119013b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        float[] fArr = this.f119012a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, kotlin.ranges.g.e(i10, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f119012a = fArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119013b;
    }

    public final void e(float f10) {
        m2.c(this, 0, 1, null);
        float[] fArr = this.f119012a;
        int iD = d();
        this.f119013b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f119012a, d());
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
