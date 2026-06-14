package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f119004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119005b;

    public j(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119004a = bufferWithData;
        this.f119005b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        byte[] bArr = this.f119004a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kotlin.ranges.g.e(i10, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f119004a = bArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119005b;
    }

    public final void e(byte b10) {
        m2.c(this, 0, 1, null);
        byte[] bArr = this.f119004a;
        int iD = d();
        this.f119005b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f119004a, d());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
