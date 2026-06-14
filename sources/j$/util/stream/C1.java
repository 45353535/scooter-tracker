package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class C1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f85002h;

    public /* synthetic */ C1(int i10) {
        this.f85002h = i10;
    }

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        switch (this.f85002h) {
            case 0:
                return new U1();
            case 1:
                return new S1();
            case 2:
                return new V1();
            default:
                return new T1();
        }
    }

    @Override // j$.util.stream.AbstractC5773v1, j$.util.stream.G3
    public final Object b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        switch (this.f85002h) {
            case 0:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            case 1:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            case 2:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            default:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
        }
        return (Long) super.b(abstractC5667a, spliterator);
    }

    @Override // j$.util.stream.AbstractC5773v1, j$.util.stream.G3
    public final Object c(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        switch (this.f85002h) {
            case 0:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            case 1:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            case 2:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
            default:
                if (!EnumC5671a3.SIZED.n(abstractC5667a.f85185f)) {
                }
                break;
        }
        return (Long) super.c(abstractC5667a, spliterator);
    }

    @Override // j$.util.stream.AbstractC5773v1, j$.util.stream.G3
    public final int d() {
        switch (this.f85002h) {
        }
        return EnumC5671a3.f85208r;
    }
}
