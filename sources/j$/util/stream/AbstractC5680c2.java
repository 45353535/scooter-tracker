package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5680c2 extends AbstractC5685d2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85230l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5680c2(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10);
        this.f85230l = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean J() {
        switch (this.f85230l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        switch (this.f85230l) {
            case 0:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
            default:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
        }
        return new Z1(this, EnumC5671a3.f85208r, 1);
    }
}
