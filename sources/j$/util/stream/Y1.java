package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85164b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f85166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC5667a f85167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C5771v c5771v, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85167e = c5771v;
        InterfaceC5725l2 interfaceC5725l22 = this.f85274a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85166d = new j$.util.E(interfaceC5725l22, 1);
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        switch (this.f85164b) {
            case 0:
                this.f85274a.l(-1L);
                break;
            default:
                this.f85274a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.f85164b) {
            case 0:
                InterfaceC5723l0 interfaceC5723l0 = (InterfaceC5723l0) ((j$.time.format.r) ((C5693f0) this.f85167e).f85260n).apply(obj);
                if (interfaceC5723l0 != null) {
                    try {
                        boolean z10 = this.f85165c;
                        j$.util.L l10 = (j$.util.L) this.f85166d;
                        if (!z10) {
                            interfaceC5723l0.sequential().forEach(l10);
                        } else {
                            j$.util.Y ySpliterator = interfaceC5723l0.sequential().spliterator();
                            while (!this.f85274a.n() && ySpliterator.tryAdvance((LongConsumer) l10)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            interfaceC5723l0.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (interfaceC5723l0 != null) {
                    interfaceC5723l0.close();
                    return;
                }
                return;
            default:
                B b10 = (B) ((j$.time.format.r) ((C5771v) this.f85167e).f85373n).apply(obj);
                if (b10 != null) {
                    try {
                        boolean z11 = this.f85165c;
                        j$.util.E e10 = (j$.util.E) this.f85166d;
                        if (!z11) {
                            b10.sequential().forEach(e10);
                        } else {
                            j$.util.T tSpliterator = b10.sequential().spliterator();
                            while (!this.f85274a.n() && tSpliterator.tryAdvance((DoubleConsumer) e10)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            b10.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                    break;
                }
                if (b10 != null) {
                    b10.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        switch (this.f85164b) {
            case 0:
                this.f85165c = true;
                break;
            default:
                this.f85165c = true;
                break;
        }
        return this.f85274a.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C5693f0 c5693f0, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85167e = c5693f0;
        InterfaceC5725l2 interfaceC5725l22 = this.f85274a;
        Objects.requireNonNull(interfaceC5725l22);
        this.f85166d = new j$.util.L(interfaceC5725l22, 1);
    }
}
