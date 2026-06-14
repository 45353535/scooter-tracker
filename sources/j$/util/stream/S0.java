package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class S0 extends R0 implements InterfaceC5767u0 {
    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    @Override // j$.util.stream.InterfaceC5782x0
    public final /* bridge */ /* synthetic */ F0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC5767u0, j$.util.stream.InterfaceC5782x0
    public final InterfaceC5792z0 a() {
        int i10 = this.f85132b;
        double[] dArr = this.f85131a;
        if (i10 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f85132b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        double[] dArr = this.f85131a;
        if (j10 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(dArr.length)));
        }
        this.f85132b = 0;
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f85132b;
        double[] dArr = this.f85131a;
        if (i10 < dArr.length) {
            this.f85132b = 1 + i10;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = this.f85132b;
        double[] dArr = this.f85131a;
        if (i10 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f85132b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.R0
    public final String toString() {
        double[] dArr = this.f85131a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f85132b), Arrays.toString(dArr));
    }
}
