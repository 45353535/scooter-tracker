package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class K1 implements Q1, InterfaceC5715j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f85073c;

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

    public K1(int i10, IntBinaryOperator intBinaryOperator) {
        this.f85072b = i10;
        this.f85073c = intBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        accept(((K1) q12).f85071a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85071a = this.f85072b;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        this.f85071a = this.f85073c.applyAsInt(this.f85071a, i10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f85071a);
    }
}
