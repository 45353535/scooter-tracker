package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class cm0 implements wn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am0 f109461a;

    public cm0(Handler handler) {
        this.f109461a = new am0(handler);
    }

    public final void a(km2 km2Var, qn2 qn2Var, jr jrVar) {
        synchronized (km2Var.f112766f) {
            km2Var.f112772l = true;
        }
        km2Var.a("post-response");
        am0 am0Var = this.f109461a;
        am0Var.f108718a.post(new bm0(km2Var, qn2Var, jrVar));
    }
}
