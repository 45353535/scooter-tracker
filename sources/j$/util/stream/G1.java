package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class G1 implements Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f85035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f85036c;

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

    public G1(BinaryOperator binaryOperator) {
        this.f85036c = binaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        G1 g12 = (G1) q12;
        if (g12.f85034a) {
            return;
        }
        p(g12.f85035b);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85034a = true;
        this.f85035b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        if (this.f85034a) {
            this.f85034a = false;
            this.f85035b = obj;
        } else {
            this.f85035b = this.f85036c.apply(this.f85035b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f85034a ? Optional.empty() : Optional.of(this.f85035b);
    }
}
