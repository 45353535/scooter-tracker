package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5781x extends AbstractC5786y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85395l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5781x(AbstractC5667a abstractC5667a, int i10, int i11) {
        super(abstractC5667a, i10);
        this.f85395l = i11;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean J() {
        switch (this.f85395l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final B sequential() {
        switch (this.f85395l) {
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
    public final B parallel() {
        switch (this.f85395l) {
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
        switch (this.f85395l) {
            case 0:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
            default:
                if (!EnumC5671a3.ORDERED.n(this.f85185f)) {
                }
                break;
        }
        return new r(this, EnumC5671a3.f85208r, 1);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f85395l) {
        }
        return spliterator();
    }
}
