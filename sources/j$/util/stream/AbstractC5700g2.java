package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5700g2 implements InterfaceC5720k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5725l2 f85266a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
    }

    public AbstractC5700g2(InterfaceC5725l2 interfaceC5725l2) {
        this.f85266a = (InterfaceC5725l2) Objects.requireNonNull(interfaceC5725l2);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        this.f85266a.l(j10);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public void k() {
        this.f85266a.k();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public boolean n() {
        return this.f85266a.n();
    }
}
