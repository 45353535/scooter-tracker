package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class I1 extends R1 implements Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f85053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f85054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f85055d;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85133a = this.f85055d.apply(this.f85133a, ((I1) q12).f85133a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85133a = this.f85053b.get();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.f85054c.accept(this.f85133a, obj);
    }

    public I1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f85053b = supplier;
        this.f85054c = biConsumer;
        this.f85055d = binaryOperator;
    }
}
