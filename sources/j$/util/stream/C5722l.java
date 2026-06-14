package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5722l extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85303b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f85305d;

    public /* synthetic */ C5722l(InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5722l(J3 j32, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85305d = j32;
        this.f85304c = true;
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        switch (this.f85303b) {
            case 0:
                this.f85304c = false;
                this.f85305d = null;
                this.f85274a.l(-1L);
                break;
            case 1:
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
        switch (this.f85303b) {
            case 0:
                InterfaceC5725l2 interfaceC5725l2 = this.f85274a;
                if (obj == null) {
                    if (this.f85304c) {
                        return;
                    }
                    this.f85304c = true;
                    this.f85305d = null;
                    interfaceC5725l2.p((Object) null);
                    return;
                }
                Object obj2 = this.f85305d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f85305d = obj;
                    interfaceC5725l2.p(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.time.format.r) ((C5747q) this.f85305d).f85337n).apply(obj);
                if (stream != null) {
                    try {
                        boolean z10 = this.f85304c;
                        InterfaceC5725l2 interfaceC5725l22 = this.f85274a;
                        if (!z10) {
                            ((Stream) stream.sequential()).forEach(interfaceC5725l22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC5725l22.n() && spliterator.tryAdvance(interfaceC5725l22)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f85304c) {
                    boolean zTest = ((J3) this.f85305d).f85068m.test(obj);
                    this.f85304c = zTest;
                    if (zTest) {
                        this.f85274a.p(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public boolean n() {
        switch (this.f85303b) {
            case 1:
                this.f85304c = true;
                return this.f85274a.n();
            case 2:
                return !this.f85304c || this.f85274a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public void k() {
        switch (this.f85303b) {
            case 0:
                this.f85304c = false;
                this.f85305d = null;
                this.f85274a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5722l(C5747q c5747q, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85305d = c5747q;
    }
}
