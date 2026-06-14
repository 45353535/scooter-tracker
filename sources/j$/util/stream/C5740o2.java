package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5740o2 extends AbstractC5695f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5745p2 f85328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5740o2(C5745p2 c5745p2, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85328d = c5745p2;
        this.f85326b = c5745p2.f85334l;
        long j10 = c5745p2.f85335m;
        this.f85327c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85261a.l(AbstractC5779w2.a(j10, this.f85328d.f85334l, this.f85327c));
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        long j10 = this.f85326b;
        if (j10 == 0) {
            long j11 = this.f85327c;
            if (j11 > 0) {
                this.f85327c = j11 - 1;
                this.f85261a.accept(i10);
                return;
            }
            return;
        }
        this.f85326b = j10 - 1;
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85327c == 0 || this.f85261a.n();
    }
}
