package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5690e2 implements InterfaceC5710i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5725l2 f85254a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        AbstractC5773v1.e(this, d10);
    }

    public AbstractC5690e2(InterfaceC5725l2 interfaceC5725l2) {
        this.f85254a = (InterfaceC5725l2) Objects.requireNonNull(interfaceC5725l2);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        this.f85254a.l(j10);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void k() {
        this.f85254a.k();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public boolean n() {
        return this.f85254a.n();
    }
}
