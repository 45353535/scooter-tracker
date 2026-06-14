package oa;

import cb.h;
import java.io.EOFException;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.d0 f96545a = new q9.d0(10);

    public n9.v a(s sVar, h.a aVar) throws Throwable {
        n9.v vVarE = null;
        int i10 = 0;
        while (true) {
            try {
                sVar.peekFully(this.f96545a.e(), 0, 10);
                this.f96545a.W(0);
                if (this.f96545a.K() != 4801587) {
                    break;
                }
                this.f96545a.X(3);
                int iG = this.f96545a.G();
                int i11 = iG + 10;
                if (vVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f96545a.e(), 0, bArr, 0, 10);
                    sVar.peekFully(bArr, 10, iG);
                    vVarE = new cb.h(aVar).e(bArr, i11);
                } else {
                    sVar.advancePeekPosition(iG);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        sVar.resetPeekPosition();
        sVar.advancePeekPosition(i10);
        return vVarE;
    }
}
