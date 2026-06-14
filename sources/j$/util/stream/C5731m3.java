package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5731m3 implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f85315b;

    public /* synthetic */ C5731m3(IntConsumer intConsumer, int i10) {
        this.f85314a = i10;
        this.f85315b = intConsumer;
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
        switch (this.f85314a) {
            case 0:
                AbstractC5773v1.a();
                throw null;
            default:
                AbstractC5773v1.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5715j2, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        switch (this.f85314a) {
            case 0:
                this.f85315b.accept(i10);
                break;
            default:
                ((R2) this.f85315b).accept(i10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        switch (this.f85314a) {
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
        switch (this.f85314a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f85314a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f85314a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
        int i10 = this.f85314a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void l(long j10) {
        int i10 = this.f85314a;
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        switch (this.f85314a) {
            case 0:
                AbstractC5773v1.g(this, num);
                break;
            default:
                AbstractC5773v1.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        switch (this.f85314a) {
        }
        return false;
    }
}
