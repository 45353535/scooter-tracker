package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D3 implements InterfaceC5725l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f85018b;

    public /* synthetic */ D3(Consumer consumer, int i10) {
        this.f85017a = i10;
        this.f85018b = consumer;
    }

    private final /* synthetic */ void b(long j10) {
    }

    private final /* synthetic */ void c(long j10) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        switch (this.f85017a) {
            case 0:
                AbstractC5773v1.a();
                throw null;
            default:
                AbstractC5773v1.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f85017a) {
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
        switch (this.f85017a) {
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
    public final void p(Object obj) {
        switch (this.f85017a) {
            case 0:
                ((W2) this.f85018b).p(obj);
                break;
            default:
                this.f85018b.p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f85017a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
        int i10 = this.f85017a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void l(long j10) {
        int i10 = this.f85017a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        switch (this.f85017a) {
        }
        return false;
    }
}
