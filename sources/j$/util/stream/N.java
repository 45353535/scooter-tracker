package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends P implements InterfaceC5720k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LongConsumer f85097b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
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

    public N(LongConsumer longConsumer, boolean z10) {
        super(z10);
        this.f85097b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        this.f85097b.accept(j10);
    }
}
