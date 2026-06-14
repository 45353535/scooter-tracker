package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5748q0 extends AbstractC5752r0 implements InterfaceC5710i2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    @Override // j$.util.stream.AbstractC5752r0, j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        if (this.f85349a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d10);
        throw null;
    }
}
