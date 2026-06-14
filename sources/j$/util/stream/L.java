package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends P implements InterfaceC5710i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DoubleConsumer f85080b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
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

    public L(DoubleConsumer doubleConsumer, boolean z10) {
        super(z10);
        this.f85080b = doubleConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85080b.accept(d10);
    }
}
