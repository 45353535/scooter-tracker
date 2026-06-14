package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ri2 implements uw0, lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw0 f115458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f115459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lr3 f115460c;

    public /* synthetic */ ri2(tw0 tw0Var) {
        this(tw0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(ri2 ri2Var) {
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new fr3(lr3Var));
        }
    }

    public static final void b(ri2 ri2Var) {
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new gr3(lr3Var));
        }
    }

    public static final void c(ri2 ri2Var) {
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new jr3(lr3Var));
        }
        tw0 tw0Var = ri2Var.f115458a;
        if (tw0Var != null) {
            tw0Var.onAdShown();
        }
    }

    @Override // yads.uw0
    public final void onAdClicked() {
        this.f115459b.post(new Runnable() { // from class: yads.to0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.a(this.f116307b);
            }
        });
    }

    @Override // yads.uw0
    public final void onAdDismissed() {
        this.f115459b.post(new Runnable() { // from class: yads.wo0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.b(this.f117525b);
            }
        });
    }

    @Override // yads.uw0
    public final void onAdShown() {
        this.f115459b.post(new Runnable() { // from class: yads.ro0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.c(this.f115534b);
            }
        });
    }

    public ri2(tw0 tw0Var, Handler handler) {
        this.f115458a = tw0Var;
        this.f115459b = handler;
    }

    public final void a(final l7 l7Var) {
        this.f115459b.post(new Runnable() { // from class: yads.jp0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.a(l7Var, this);
            }
        });
    }

    public static final void a(l7 l7Var, ri2 ri2Var) {
        String str = l7Var.f112991b;
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new hr3(lr3Var, new cn3(str)));
        }
    }

    @Override // yads.uw0
    public final void a(final i5 i5Var) {
        this.f115459b.post(new Runnable() { // from class: yads.rn0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.a(this.f115527b, i5Var);
            }
        });
    }

    public static final void a(ri2 ri2Var, i5 i5Var) {
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new ir3(lr3Var, i5Var != null ? new ro3(i5Var) : null));
        }
    }

    @Override // yads.lp2
    public final void a(final tt2 tt2Var) {
        this.f115459b.post(new Runnable() { // from class: yads.qn0
            @Override // java.lang.Runnable
            public final void run() {
                ri2.a(this.f115096b, tt2Var);
            }
        });
    }

    public static final void a(ri2 ri2Var, ko2 ko2Var) {
        lr3 lr3Var = ri2Var.f115460c;
        if (lr3Var != null) {
            new CallbackStackTraceMarker(new kr3(lr3Var, new dr3(ko2Var)));
        }
    }
}
