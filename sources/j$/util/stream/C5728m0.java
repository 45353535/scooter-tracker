package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5728m0 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC5757s0 f85309b;

    public /* synthetic */ C5728m0(EnumC5757s0 enumC5757s0, int i10) {
        this.f85308a = i10;
        this.f85309b = enumC5757s0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f85308a) {
            case 0:
                return new C5743p0(this.f85309b);
            default:
                return new C5748q0(this.f85309b);
        }
    }
}
