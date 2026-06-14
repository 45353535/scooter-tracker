package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5747q extends AbstractC5680c2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f85336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f85337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5747q(AbstractC5667a abstractC5667a, int i10, Object obj, int i11) {
        super(abstractC5667a, i10, 1);
        this.f85336m = i11;
        this.f85337n = obj;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85336m) {
            case 0:
                return new C5742p(this, interfaceC5725l2, 0);
            case 1:
                return new T(this, interfaceC5725l2, 0);
            case 2:
                return new C5678c0(this, interfaceC5725l2, 0);
            case 3:
                return new C5727m(this, interfaceC5725l2, 1);
            case 4:
                return new C5727m(this, interfaceC5725l2, 2);
            case 5:
                return new C5727m(this, interfaceC5725l2, 3);
            default:
                return new C5722l(this, interfaceC5725l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5747q(AbstractC5685d2 abstractC5685d2, Consumer consumer) {
        super(abstractC5685d2, 0, 1);
        this.f85336m = 3;
        this.f85337n = consumer;
    }
}
