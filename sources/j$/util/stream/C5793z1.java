package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5793z1 implements Q1, InterfaceC5710i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f85407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f85408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f85409c;

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

    public C5793z1(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f85408b = d10;
        this.f85409c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        accept(((C5793z1) q12).f85407a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85407a = this.f85408b;
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85407a = this.f85409c.applyAsDouble(this.f85407a, d10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f85407a);
    }
}
