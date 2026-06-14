package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5741o3 implements InterfaceC5720k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f85330b;

    public /* synthetic */ C5741o3(LongConsumer longConsumer, int i10) {
        this.f85329a = i10;
        this.f85330b = longConsumer;
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
        switch (this.f85329a) {
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
        switch (this.f85329a) {
            case 0:
                AbstractC5773v1.k();
                throw null;
            default:
                AbstractC5773v1.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5720k2, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        switch (this.f85329a) {
            case 0:
                this.f85330b.accept(j10);
                break;
            default:
                ((T2) this.f85330b).accept(j10);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.f85329a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f85329a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f85329a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        switch (this.f85329a) {
            case 0:
                AbstractC5773v1.i(this, l10);
                break;
            default:
                AbstractC5773v1.i(this, l10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void k() {
        int i10 = this.f85329a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void l(long j10) {
        int i10 = this.f85329a;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        switch (this.f85329a) {
        }
        return false;
    }
}
