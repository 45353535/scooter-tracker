package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class qc0 implements mj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj0 f114937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hj0 f114938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc0 f114940e;

    public qc0(tc0 tc0Var, jj0 jj0Var) {
        this.f114940e = tc0Var;
        this.f114937b = jj0Var;
    }

    public final void a(final yv0 yv0Var) {
        Handler handler = this.f114940e.f116186u;
        handler.getClass();
        handler.post(new Runnable() { // from class: yads.te0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116213b.b(yv0Var);
            }
        });
    }

    public final void b(yv0 yv0Var) {
        tc0 tc0Var = this.f114940e;
        if (tc0Var.f116181p == 0 || this.f114939d) {
            return;
        }
        Looper looper = tc0Var.f116185t;
        looper.getClass();
        this.f114938c = tc0Var.a(looper, this.f114937b, yv0Var, false);
        this.f114940e.f116179n.add(this);
    }

    @Override // yads.mj0
    public final void release() {
        Handler handler = this.f114940e.f116186u;
        handler.getClass();
        w83.a(handler, new Runnable() { // from class: yads.fe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110694b.a();
            }
        });
    }

    public final /* synthetic */ void a() {
        if (this.f114939d) {
            return;
        }
        hj0 hj0Var = this.f114938c;
        if (hj0Var != null) {
            hj0Var.a(this.f114937b);
        }
        this.f114940e.f116179n.remove(this);
        this.f114939d = true;
    }
}
