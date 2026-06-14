package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5670a2 extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.I f85194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f85195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5670a2(U u10, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85195d = u10;
        InterfaceC5725l2 interfaceC5725l22 = this.f85274a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85194c = new j$.util.I(interfaceC5725l22, 1);
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85274a.l(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) throws Exception {
        IntStream intStream = (IntStream) ((j$.time.format.r) this.f85195d.f85145m).apply(obj);
        if (intStream != null) {
            try {
                boolean z10 = this.f85193b;
                j$.util.I i10 = this.f85194c;
                if (!z10) {
                    intStream.sequential().forEach(i10);
                } else {
                    Spliterator.OfInt ofIntSpliterator = intStream.sequential().spliterator();
                    while (!this.f85274a.n() && ofIntSpliterator.tryAdvance((IntConsumer) i10)) {
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

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        this.f85193b = true;
        return this.f85274a.n();
    }
}
