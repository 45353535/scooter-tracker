package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5721k3 implements InterfaceC5710i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f85302b;

    public /* synthetic */ C5721k3(DoubleConsumer doubleConsumer, int i10) {
        this.f85301a = i10;
        this.f85302b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j10) {
    }

    private final /* synthetic */ void c(long j10) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f85301a) {
            case 0:
                this.f85302b.accept(d10);
                break;
            default:
                ((P2) this.f85302b).accept(d10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f85301a) {
            case 0:
                AbstractC5773v1.k();
                throw null;
            default:
                AbstractC5773v1.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        switch (this.f85301a) {
            case 0:
                AbstractC5773v1.l();
                throw null;
            default:
                AbstractC5773v1.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f85301a) {
            case 0:
                p((Double) obj);
                break;
            default:
                p((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f85301a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f85301a) {
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
        int i10 = this.f85301a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void l(long j10) {
        int i10 = this.f85301a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        switch (this.f85301a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC5710i2
    public final /* synthetic */ void p(Double d10) {
        switch (this.f85301a) {
            case 0:
                AbstractC5773v1.e(this, d10);
                break;
            default:
                AbstractC5773v1.e(this, d10);
                break;
        }
    }
}
