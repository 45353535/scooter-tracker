package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5750q2 extends AbstractC5700g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5754r2 f85347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5750q2(C5754r2 c5754r2, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85347d = c5754r2;
        this.f85345b = c5754r2.f85351m;
        long j10 = c5754r2.f85352n;
        this.f85346c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85266a.l(AbstractC5779w2.a(j10, this.f85347d.f85351m, this.f85346c));
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        long j11 = this.f85345b;
        if (j11 == 0) {
            long j12 = this.f85346c;
            if (j12 > 0) {
                this.f85346c = j12 - 1;
                this.f85266a.accept(j10);
                return;
            }
            return;
        }
        this.f85345b = j11 - 1;
    }

    @Override // j$.util.stream.AbstractC5700g2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85346c == 0 || this.f85266a.n();
    }
}
