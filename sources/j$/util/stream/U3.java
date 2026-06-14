package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 extends AbstractC5690e2 implements X3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V3 f85152b;

    @Override // j$.util.stream.X3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(V3 v32, InterfaceC5725l2 interfaceC5725l2, boolean z10) {
        super(interfaceC5725l2);
        this.f85152b = v32;
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85152b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d10);
        throw null;
    }
}
