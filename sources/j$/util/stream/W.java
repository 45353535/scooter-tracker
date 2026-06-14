package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends AbstractC5695f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.I f85157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f85158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(U u10, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85158d = u10;
        InterfaceC5725l2 interfaceC5725l22 = this.f85261a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85157c = new j$.util.I(interfaceC5725l22, 1);
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85261a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) throws Exception {
        IntStream intStream = (IntStream) ((K) this.f85158d.f85145m).apply(i10);
        if (intStream != null) {
            try {
                boolean z10 = this.f85156b;
                j$.util.I i11 = this.f85157c;
                if (!z10) {
                    intStream.sequential().forEach(i11);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f85261a.n() && ofIntSpliterator.tryAdvance((IntConsumer) i11)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        this.f85156b = true;
        return this.f85261a.n();
    }
}
