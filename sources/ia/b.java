package ia;

import lb.j;
import lb.k;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
final class b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t f73972p;

    public b(String str, t tVar) {
        super(str);
        this.f73972p = tVar;
    }

    @Override // lb.j
    protected k w(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f73972p.reset();
        }
        return this.f73972p.parseToLegacySubtitle(bArr, 0, i10);
    }
}
