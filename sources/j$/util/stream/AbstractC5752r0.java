package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5752r0 implements InterfaceC5725l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85350b;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void l(long j10) {
    }

    public AbstractC5752r0(EnumC5757s0 enumC5757s0) {
        this.f85350b = !enumC5757s0.f85356b;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85349a;
    }
}
