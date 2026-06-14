package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I implements H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f85050b;

    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
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
    public final /* synthetic */ void l(long j10) {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(Object obj) {
        if (this.f85049a) {
            return;
        }
        this.f85049a = true;
        this.f85050b = obj;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        return this.f85049a;
    }
}
