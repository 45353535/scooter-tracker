package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f23369a;

    public k(l lVar) {
        this.f23369a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f23369a;
        int i10 = lVar.f23410j;
        if (i10 != 0) {
            int i11 = (lVar.f23409i / i10) + lVar.E;
            lVar.E = i11;
            lVar.a(i11);
        }
        l lVar2 = this.f23369a;
        if (lVar2.E < lVar2.F) {
            lVar2.postDelayed(lVar2.D, lVar2.f23411k);
            return;
        }
        lVar2.D = null;
        lVar2.E = 0;
        lVar2.F = 0;
    }
}
