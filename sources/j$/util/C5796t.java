package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5796t extends C5663o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C5663o, java.util.List
    public final java.util.List subList(int i10, int i11) {
        return new C5796t(this.f84961b.subList(i10, i11));
    }

    private Object writeReplace() {
        return new C5663o(this.f84961b);
    }
}
