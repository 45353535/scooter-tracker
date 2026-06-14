package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class jd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc3 f112324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd3 f112325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f112326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f112327d;

    public /* synthetic */ jd3(vc3 vc3Var, fd3 fd3Var) {
        this(vc3Var, fd3Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f112327d) {
            this.f112325b.b();
            this.f112326c.removeCallbacksAndMessages(null);
            this.f112327d = false;
        }
    }

    public jd3(vc3 vc3Var, fd3 fd3Var, Handler handler) {
        this.f112324a = vc3Var;
        this.f112325b = fd3Var;
        this.f112326c = handler;
    }
}
