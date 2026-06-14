package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5766u extends AbstractC5690e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.E f85365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5771v f85366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5766u(C5771v c5771v, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85366d = c5771v;
        InterfaceC5725l2 interfaceC5725l22 = this.f85254a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85365c = new j$.util.E(interfaceC5725l22, 1);
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85254a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) throws Exception {
        B b10 = (B) ((j$.time.format.r) this.f85366d.f85373n).apply(d10);
        if (b10 != null) {
            try {
                boolean z10 = this.f85364b;
                j$.util.E e10 = this.f85365c;
                if (!z10) {
                    b10.sequential().forEach(e10);
                } else {
                    j$.util.T tSpliterator = b10.sequential().spliterator();
                    while (!this.f85254a.n() && tSpliterator.tryAdvance((DoubleConsumer) e10)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    b10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b10 != null) {
            b10.close();
        }
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        this.f85364b = true;
        return this.f85254a.n();
    }
}
