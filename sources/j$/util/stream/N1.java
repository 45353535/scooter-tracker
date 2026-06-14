package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 extends R1 implements Q1, InterfaceC5715j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f85098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f85099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5737o f85100d;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
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
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85133a = this.f85100d.apply(this.f85133a, ((N1) q12).f85133a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85133a = this.f85098b.get();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        this.f85099c.accept(this.f85133a, i10);
    }

    public N1(Supplier supplier, ObjIntConsumer objIntConsumer, C5737o c5737o) {
        this.f85098b = supplier;
        this.f85099c = objIntConsumer;
        this.f85100d = c5737o;
    }
}
