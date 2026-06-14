package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5705h2 implements InterfaceC5725l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5725l2 f85274a;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public AbstractC5705h2(InterfaceC5725l2 interfaceC5725l2) {
        this.f85274a = (InterfaceC5725l2) Objects.requireNonNull(interfaceC5725l2);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        this.f85274a.l(j10);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void k() {
        this.f85274a.k();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public boolean n() {
        return this.f85274a.n();
    }
}
