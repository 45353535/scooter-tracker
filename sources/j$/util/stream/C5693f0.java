package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5693f0 extends AbstractC5703h0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f85259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f85260n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5693f0(AbstractC5667a abstractC5667a, int i10, Object obj, int i11) {
        super(abstractC5667a, i10, 1);
        this.f85259m = i11;
        this.f85260n = obj;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5725l2 K(int i10, InterfaceC5725l2 interfaceC5725l2) {
        switch (this.f85259m) {
            case 0:
                return new C5688e0(this, interfaceC5725l2);
            case 1:
                return new C5678c0(this, interfaceC5725l2, 5);
            case 2:
                return new Y1(this, interfaceC5725l2);
            default:
                return new C5727m(this, interfaceC5725l2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5693f0(AbstractC5708i0 abstractC5708i0, LongConsumer longConsumer) {
        super(abstractC5708i0, 0, 1);
        this.f85259m = 1;
        this.f85260n = longConsumer;
    }
}
