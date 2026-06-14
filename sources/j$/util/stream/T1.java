package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 extends W1 implements InterfaceC5715j2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f85159b);
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85159b += ((W1) q12).f85159b;
    }

    @Override // j$.util.stream.W1, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        this.f85159b++;
    }
}
