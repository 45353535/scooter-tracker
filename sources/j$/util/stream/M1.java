package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M1 implements Q1, InterfaceC5715j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f85092c;

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

    public M1(IntBinaryOperator intBinaryOperator) {
        this.f85092c = intBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        M1 m12 = (M1) q12;
        if (m12.f85090a) {
            return;
        }
        accept(m12.f85091b);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85090a = true;
        this.f85091b = 0;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        if (this.f85090a) {
            this.f85090a = false;
            this.f85091b = i10;
        } else {
            this.f85091b = this.f85092c.applyAsInt(this.f85091b, i10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f85090a ? j$.util.C.f84780c : new j$.util.C(this.f85091b);
    }
}
