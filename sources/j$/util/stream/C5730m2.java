package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5730m2 extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5735n2 f85313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5730m2(C5735n2 c5735n2, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85313d = c5735n2;
        this.f85311b = c5735n2.f85319m;
        long j10 = c5735n2.f85320n;
        this.f85312c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85274a.l(AbstractC5779w2.a(j10, this.f85313d.f85319m, this.f85312c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        long j10 = this.f85311b;
        if (j10 == 0) {
            long j11 = this.f85312c;
            if (j11 > 0) {
                this.f85312c = j11 - 1;
                this.f85274a.p(obj);
                return;
            }
            return;
        }
        this.f85311b = j10 - 1;
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85312c == 0 || this.f85274a.n();
    }
}
