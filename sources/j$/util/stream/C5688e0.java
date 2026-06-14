package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5688e0 extends AbstractC5700g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.L f85252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5693f0 f85253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5688e0(C5693f0 c5693f0, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85253d = c5693f0;
        InterfaceC5725l2 interfaceC5725l22 = this.f85266a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85252c = new j$.util.L(interfaceC5725l22, 1);
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85266a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) throws Exception {
        InterfaceC5723l0 interfaceC5723l0 = (InterfaceC5723l0) ((j$.time.format.r) this.f85253d.f85260n).apply(j10);
        if (interfaceC5723l0 != null) {
            try {
                boolean z10 = this.f85251b;
                j$.util.L l10 = this.f85252c;
                if (!z10) {
                    interfaceC5723l0.sequential().forEach(l10);
                } else {
                    j$.util.Y ySpliterator = interfaceC5723l0.sequential().spliterator();
                    while (!this.f85266a.n() && ySpliterator.tryAdvance((LongConsumer) l10)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    interfaceC5723l0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (interfaceC5723l0 != null) {
            interfaceC5723l0.close();
        }
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        this.f85251b = true;
        return this.f85266a.n();
    }
}
