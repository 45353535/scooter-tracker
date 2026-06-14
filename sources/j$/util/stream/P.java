package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P implements G3, H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85117a;

    public /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

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

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public P(boolean z10) {
        this.f85117a = z10;
    }

    @Override // j$.util.stream.G3
    public final int d() {
        if (this.f85117a) {
            return 0;
        }
        return EnumC5671a3.f85208r;
    }

    public final void e(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        if (this.f85117a) {
            new Q(abstractC5667a, spliterator, this).invoke();
        } else {
            new S(abstractC5667a, spliterator, abstractC5667a.P(this)).invoke();
        }
    }
}
