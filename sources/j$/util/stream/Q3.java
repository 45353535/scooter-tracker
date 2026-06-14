package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class Q3 extends AbstractC5700g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85130b;

    public Q3(G2 g22, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85130b = true;
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85266a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        if (this.f85130b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j10);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return !this.f85130b || this.f85266a.n();
    }
}
