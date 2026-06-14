package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends P implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntConsumer f85089b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    @Override // j$.util.stream.G3
    public final Object b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        abstractC5667a.O(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.G3
    public final /* bridge */ /* synthetic */ Object c(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        e(abstractC5667a, spliterator);
        return null;
    }

    public M(IntConsumer intConsumer, boolean z10) {
        super(z10);
        this.f85089b = intConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        this.f85089b.accept(i10);
    }
}
