package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5658j extends C5656h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C5656h, java.util.List
    public final java.util.List subList(int i10, int i11) {
        C5658j c5658j;
        synchronized (this.f84935b) {
            c5658j = new C5658j(this.f84939c.subList(i10, i11), this.f84935b);
        }
        return c5658j;
    }

    private Object writeReplace() {
        return new C5656h(this.f84939c);
    }
}
