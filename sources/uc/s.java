package uc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends kd.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ic.f f105613c;

    public s(ic.f adElement) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        this.f105613c = adElement;
    }

    @Override // kd.b
    public void d() {
        try {
            this.f105613c.c();
        } catch (Throwable th2) {
            ic.v.i(th2);
        }
    }
}
