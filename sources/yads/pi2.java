package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class pi2 implements uw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw0 f114683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f114684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fq3 f114685c;

    public /* synthetic */ pi2(tw0 tw0Var) {
        this(tw0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(pi2 pi2Var) {
        fq3 fq3Var = pi2Var.f114685c;
        if (fq3Var != null) {
            new CallbackStackTraceMarker(new aq3(fq3Var));
        }
    }

    public static final void b(pi2 pi2Var) {
        fq3 fq3Var = pi2Var.f114685c;
        if (fq3Var != null) {
            new CallbackStackTraceMarker(new bq3(fq3Var));
        }
    }

    public static final void c(pi2 pi2Var) {
        fq3 fq3Var = pi2Var.f114685c;
        if (fq3Var != null) {
            new CallbackStackTraceMarker(new eq3(fq3Var));
        }
        tw0 tw0Var = pi2Var.f114683a;
        if (tw0Var != null) {
            tw0Var.onAdShown();
        }
    }

    @Override // yads.uw0
    public final void onAdClicked() {
        this.f114684b.post(new Runnable() { // from class: yads.i20
            @Override // java.lang.Runnable
            public final void run() {
                pi2.a(this.f111839b);
            }
        });
    }

    @Override // yads.uw0
    public final void onAdDismissed() {
        this.f114684b.post(new Runnable() { // from class: yads.sa0
            @Override // java.lang.Runnable
            public final void run() {
                pi2.b(this.f115727b);
            }
        });
    }

    @Override // yads.uw0
    public final void onAdShown() {
        this.f114684b.post(new Runnable() { // from class: yads.e20
            @Override // java.lang.Runnable
            public final void run() {
                pi2.c(this.f110163b);
            }
        });
    }

    public pi2(tw0 tw0Var, Handler handler) {
        this.f114683a = tw0Var;
        this.f114684b = handler;
    }

    public final void a(final l7 l7Var) {
        this.f114684b.post(new Runnable() { // from class: yads.za0
            @Override // java.lang.Runnable
            public final void run() {
                pi2.a(l7Var, this);
            }
        });
    }

    public static final void a(l7 l7Var, pi2 pi2Var) {
        String str = l7Var.f112991b;
        fq3 fq3Var = pi2Var.f114685c;
        if (fq3Var != null) {
            new CallbackStackTraceMarker(new cq3(fq3Var, new cn3(str)));
        }
    }

    @Override // yads.uw0
    public final void a(final i5 i5Var) {
        this.f114684b.post(new Runnable() { // from class: yads.d20
            @Override // java.lang.Runnable
            public final void run() {
                pi2.a(this.f109700b, i5Var);
            }
        });
    }

    public static final void a(pi2 pi2Var, i5 i5Var) {
        fq3 fq3Var = pi2Var.f114685c;
        if (fq3Var != null) {
            new CallbackStackTraceMarker(new dq3(fq3Var, i5Var != null ? new ro3(i5Var) : null));
        }
    }
}
