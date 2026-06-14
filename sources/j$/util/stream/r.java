package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC5781x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f85348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10, 1);
        this.f85348m = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85348m) {
            case 0:
                return new C5742p(this, interfaceC5725l2, 1);
            case 1:
                return interfaceC5725l2;
            case 2:
                return new C5742p(this, interfaceC5725l2, 4);
            case 3:
                return new V(1, interfaceC5725l2);
            case 4:
                return new T(this, interfaceC5725l2, 4);
            case 5:
                return new C5683d0(interfaceC5725l2);
            default:
                return new C5678c0(this, interfaceC5725l2, 3);
        }
    }
}
