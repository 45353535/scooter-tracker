package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class T3 extends AbstractC5690e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85143b;

    public T3(E2 e22, InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85143b = true;
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85254a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        if (this.f85143b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d10);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC5690e2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return !this.f85143b || this.f85254a.n();
    }
}
