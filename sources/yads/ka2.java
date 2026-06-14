package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class ka2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ma2 f112664b;

    public ka2(ma2 ma2Var) {
        this.f112664b = ma2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ma2 ma2Var = this.f112664b;
        ma2Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - ma2Var.f113364h;
        ma2Var.f113364h = jElapsedRealtime;
        long j11 = ma2Var.f113362f - j10;
        ma2Var.f113362f = j11;
        long jMax = (long) Math.max(0.0d, j11);
        j43 j43Var = ma2Var.f113361e;
        if (j43Var != null) {
            j43Var.a(jMax, ma2Var.f113363g - jMax);
        }
        this.f112664b.c();
    }
}
