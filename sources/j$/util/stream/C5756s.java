package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5756s extends Z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85353l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5756s(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10);
        this.f85353l = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85353l) {
            case 0:
                return new C5742p(this, interfaceC5725l2, 2);
            case 1:
                return new T(this, interfaceC5725l2, 2);
            case 2:
                return interfaceC5725l2;
            default:
                return new C5678c0(this, interfaceC5725l2, 2);
        }
    }
}
