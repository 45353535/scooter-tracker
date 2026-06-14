package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5783x1 extends R1 implements Q1, InterfaceC5720k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f85396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f85397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5737o f85398d;

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
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
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

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        this.f85133a = this.f85398d.apply(this.f85133a, ((C5783x1) q12).f85133a);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85133a = this.f85396b.get();
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        this.f85397c.accept(this.f85133a, j10);
    }

    public C5783x1(Supplier supplier, ObjLongConsumer objLongConsumer, C5737o c5737o) {
        this.f85396b = supplier;
        this.f85397c = objLongConsumer;
        this.f85398d = c5737o;
    }
}
