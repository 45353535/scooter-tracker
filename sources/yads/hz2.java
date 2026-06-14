package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes4.dex */
public final class hz2 implements je1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gz2 f111811b;

    public hz2(com.monetization.ads.exo.source.dash.a aVar) {
        this.f111811b = aVar;
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        boolean z10;
        if (this.f111811b != null) {
            synchronized (jz2.f112523b) {
                z10 = jz2.f112524c;
            }
            if (z10) {
                ((com.monetization.ads.exo.source.dash.a) this.f111811b).a();
                return;
            }
            ((com.monetization.ads.exo.source.dash.a) this.f111811b).a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // yads.je1
    public final ke1 a(me1 me1Var, long j10, long j11, IOException iOException, int i10) {
        gz2 gz2Var = this.f111811b;
        if (gz2Var != null) {
            ((com.monetization.ads.exo.source.dash.a) gz2Var).a(iOException);
        }
        return qe1.f114972d;
    }
}
