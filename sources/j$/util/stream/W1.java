package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W1 extends R1 implements Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85159b;

    public /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

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
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85159b = 0L;
    }
}
