package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends Z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f85145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractC5667a abstractC5667a, int i10, Object obj, int i11) {
        super(abstractC5667a, i10);
        this.f85144l = i11;
        this.f85145m = obj;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85144l) {
            case 0:
                return new T(this, interfaceC5725l2, 1);
            case 1:
                return new W(this, interfaceC5725l2);
            case 2:
                return new T(this, interfaceC5725l2, 5);
            case 3:
                return new C5727m(this, interfaceC5725l2, 4);
            default:
                return new C5670a2(this, interfaceC5725l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AbstractC5668a0 abstractC5668a0, IntConsumer intConsumer) {
        super(abstractC5668a0, 0);
        this.f85144l = 0;
        this.f85145m = intConsumer;
    }
}
