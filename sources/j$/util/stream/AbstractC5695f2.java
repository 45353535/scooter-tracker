package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5695f2 implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5725l2 f85261a;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    public AbstractC5695f2(InterfaceC5725l2 interfaceC5725l2) {
        this.f85261a = (InterfaceC5725l2) Objects.requireNonNull(interfaceC5725l2);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        this.f85261a.l(j10);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void k() {
        this.f85261a.k();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public boolean n() {
        return this.f85261a.n();
    }
}
