package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f119042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119043b;

    public p(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f119042a = bufferWithData;
        this.f119043b = bufferWithData.length;
        b(10);
    }

    @Override // yg.m2
    public void b(int i10) {
        char[] cArr = this.f119042a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kotlin.ranges.g.e(i10, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f119042a = cArrCopyOf;
        }
    }

    @Override // yg.m2
    public int d() {
        return this.f119043b;
    }

    public final void e(char c10) {
        m2.c(this, 0, 1, null);
        char[] cArr = this.f119042a;
        int iD = d();
        this.f119043b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // yg.m2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f119042a, d());
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
