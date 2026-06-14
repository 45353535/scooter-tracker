package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class P1 implements Q1, InterfaceC5720k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f85120c;

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

    public P1(LongBinaryOperator longBinaryOperator) {
        this.f85120c = longBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void g(Q1 q12) {
        P1 p12 = (P1) q12;
        if (p12.f85118a) {
            return;
        }
        accept(p12.f85119b);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        this.f85118a = true;
        this.f85119b = 0L;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        if (this.f85118a) {
            this.f85118a = false;
            this.f85119b = j10;
        } else {
            this.f85119b = this.f85120c.applyAsLong(this.f85119b, j10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f85118a ? j$.util.D.f84783c : new j$.util.D(this.f85119b);
    }
}
