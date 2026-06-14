package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends AbstractC5695f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i10, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85153b = i10;
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        switch (this.f85153b) {
            case 0:
                this.f85261a.accept(i10);
                break;
            default:
                this.f85261a.accept(i10);
                break;
        }
    }
}
