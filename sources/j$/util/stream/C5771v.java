package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5771v extends AbstractC5781x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f85372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f85373n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5771v(AbstractC5667a abstractC5667a, int i10, Object obj, int i11) {
        super(abstractC5667a, i10, 1);
        this.f85372m = i11;
        this.f85373n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5771v(AbstractC5786y abstractC5786y, DoubleConsumer doubleConsumer) {
        super(abstractC5786y, 0, 1);
        this.f85372m = 1;
        this.f85373n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85372m) {
            case 0:
                return new C5766u(this, interfaceC5725l2);
            case 1:
                return new C5742p(this, interfaceC5725l2, 5);
            case 2:
                return new C5727m(this, interfaceC5725l2, 6);
            default:
                return new Y1(this, interfaceC5725l2);
        }
    }
}
