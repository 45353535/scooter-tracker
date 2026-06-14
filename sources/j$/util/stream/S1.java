package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends W1 implements InterfaceC5710i2 {
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

    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f85159b);
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85159b += ((W1) q12).f85159b;
    }

    @Override // j$.util.stream.W1, j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85159b++;
    }
}
