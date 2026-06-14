package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class D1 extends R1 implements Q1, InterfaceC5710i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f85013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f85014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5737o f85015d;

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

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85133a = this.f85015d.apply(this.f85133a, ((D1) q12).f85133a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85133a = this.f85013b.get();
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85014c.accept(this.f85133a, d10);
    }

    public D1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C5737o c5737o) {
        this.f85013b = supplier;
        this.f85014c = objDoubleConsumer;
        this.f85015d = c5737o;
    }
}
