package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5759s2 extends AbstractC5690e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5764t2 f85359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5759s2(C5764t2 c5764t2, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85359d = c5764t2;
        this.f85357b = c5764t2.f85362m;
        long j10 = c5764t2.f85363n;
        this.f85358c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85254a.l(AbstractC5779w2.a(j10, this.f85359d.f85362m, this.f85358c));
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        long j10 = this.f85357b;
        if (j10 == 0) {
            long j11 = this.f85358c;
            if (j11 > 0) {
                this.f85358c = j11 - 1;
                this.f85254a.accept(d10);
                return;
            }
            return;
        }
        this.f85357b = j10 - 1;
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85358c == 0 || this.f85254a.n();
    }
}
