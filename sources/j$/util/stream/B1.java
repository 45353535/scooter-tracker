package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 implements Q1, InterfaceC5710i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f84993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f84994c;

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
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    public B1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f84994c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        B1 b12 = (B1) q12;
        if (b12.f84992a) {
            return;
        }
        accept(b12.f84993b);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f84992a = true;
        this.f84993b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        if (this.f84992a) {
            this.f84992a = false;
            this.f84993b = d10;
        } else {
            this.f84993b = this.f84994c.applyAsDouble(this.f84993b, d10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f84992a ? j$.util.B.f84772c : new j$.util.B(this.f84993b);
    }
}
