package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5729m1 extends AbstractC5749q1 implements InterfaceC5710i2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double[] f85310h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    public C5729m1(Spliterator spliterator, AbstractC5667a abstractC5667a, double[] dArr) {
        super(spliterator, abstractC5667a, dArr.length);
        this.f85310h = dArr;
    }

    public C5729m1(C5729m1 c5729m1, Spliterator spliterator, long j10, long j11) {
        super(c5729m1, spliterator, j10, j11, c5729m1.f85310h.length);
        this.f85310h = c5729m1.f85310h;
    }

    @Override // j$.util.stream.AbstractC5749q1
    public final AbstractC5749q1 b(Spliterator spliterator, long j10, long j11) {
        return new C5729m1(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.AbstractC5749q1, j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f85343f;
        if (i10 >= this.f85344g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f85343f));
        }
        double[] dArr = this.f85310h;
        this.f85343f = i10 + 1;
        dArr[i10] = d10;
    }
}
