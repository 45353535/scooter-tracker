package yg;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p3 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f119046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119047b;

    public /* synthetic */ p3(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // yg.m2
    public /* bridge */ /* synthetic */ Object a() {
        return lf.z.a(f());
    }

    @Override // yg.m2
    public void b(int i10) {
        if (lf.z.n(this.f119046a) < i10) {
            short[] sArr = this.f119046a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, kotlin.ranges.g.e(i10, lf.z.n(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f119046a = lf.z.f(sArrCopyOf);
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119047b;
    }

    public final void e(short s10) {
        m2.c(this, 0, 1, null);
        short[] sArr = this.f119046a;
        int iD = d();
        this.f119047b = iD + 1;
        lf.z.r(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f119046a, d());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return lf.z.f(sArrCopyOf);
    }

    private p3(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119046a = bufferWithData;
        this.f119047b = lf.z.n(bufferWithData);
        b(10);
    }
}
