package yg;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f118975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f118976b;

    public /* synthetic */ g3(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // yg.m2
    public /* bridge */ /* synthetic */ Object a() {
        return lf.s.a(f());
    }

    @Override // yg.m2
    public void b(int i10) {
        if (lf.s.n(this.f118975a) < i10) {
            byte[] bArr = this.f118975a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kotlin.ranges.g.e(i10, lf.s.n(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f118975a = lf.s.f(bArrCopyOf);
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f118976b;
    }

    public final void e(byte b10) {
        m2.c(this, 0, 1, null);
        byte[] bArr = this.f118975a;
        int iD = d();
        this.f118976b = iD + 1;
        lf.s.r(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f118975a, d());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return lf.s.f(bArrCopyOf);
    }

    private g3(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f118975a = bufferWithData;
        this.f118976b = lf.s.n(bufferWithData);
        b(10);
    }
}
