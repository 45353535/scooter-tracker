package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f85108b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public O(Consumer consumer, boolean z10) {
        super(z10);
        this.f85108b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f85108b.accept(obj);
    }
}
