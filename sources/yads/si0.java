package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class si0 extends Thread implements xi0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0 f115817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yi0 f115818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ui0 f115819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f115821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile qi0 f115822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f115823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Exception f115824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f115825j = -1;

    public si0(wi0 wi0Var, yi0 yi0Var, ui0 ui0Var, boolean z10, int i10, qi0 qi0Var) {
        this.f115817b = wi0Var;
        this.f115818c = yi0Var;
        this.f115819d = ui0Var;
        this.f115820e = z10;
        this.f115821f = i10;
        this.f115822g = qi0Var;
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f115822g = null;
        }
        if (this.f115823h) {
            return;
        }
        this.f115823h = true;
        sh2 sh2Var = (sh2) this.f115818c;
        sh2Var.f115812g = true;
        rh2 rh2Var = sh2Var.f115811f;
        if (rh2Var != null) {
            rh2Var.cancel(true);
        }
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f115820e) {
                sh2 sh2Var = (sh2) this.f115818c;
                ir irVar = sh2Var.f115808c;
                ((iw2) irVar.f112088a).c(irVar.f112092e.a(sh2Var.f115807b));
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f115823h) {
                    try {
                        ((sh2) this.f115818c).a(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f115823h) {
                            long j11 = this.f115819d.f116657a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f115821f) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f115824i = e11;
        }
        qi0 qi0Var = this.f115822g;
        if (qi0Var != null) {
            qi0Var.obtainMessage(9, this).sendToTarget();
        }
    }
}
