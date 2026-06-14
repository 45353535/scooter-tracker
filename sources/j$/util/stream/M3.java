package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class M3 extends AbstractC5695f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f85096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(N3 n32, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85096c = n32;
        this.f85095b = true;
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85261a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        if (this.f85095b) {
            boolean zTest = this.f85096c.f85107l.test(i10);
            this.f85095b = zTest;
            if (zTest) {
                this.f85261a.accept(i10);
            }
        }
    }

    @Override // j$.util.stream.AbstractC5695f2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return !this.f85095b || this.f85261a.n();
    }
}
