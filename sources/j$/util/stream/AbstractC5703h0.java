package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5703h0 extends AbstractC5708i0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85273l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5703h0(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10);
        this.f85273l = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean J() {
        switch (this.f85273l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final InterfaceC5723l0 sequential() {
        switch (this.f85273l) {
            case 0:
                this.f85180a.f85190k = false;
                break;
            default:
                this.f85180a.f85190k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final InterfaceC5723l0 parallel() {
        switch (this.f85273l) {
            case 0:
                this.f85180a.f85190k = true;
                break;
            default:
                this.f85180a.f85190k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final InterfaceC5697g unordered() {
        switch (this.f85273l) {
            case 0:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
            default:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
        }
        return new C5761t(this, EnumC5671a3.f85208r, 4);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f85273l) {
        }
        return spliterator();
    }
}
