package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends W1 implements InterfaceC5720k2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
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
    public final void accept(long j10) {
        this.f85159b++;
    }
}
