package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class u82 implements s82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f116565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f116566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedCallback f116567c = new OnBackInvokedCallback() { // from class: yads.zq0
        public final void onBackInvoked() {
            u82.a(this.f118762a);
        }
    };

    public u82(Activity activity, w1 w1Var) {
        this.f116565a = activity;
        this.f116566b = w1Var;
    }

    public static final void a(u82 u82Var) {
        w1 w1Var = u82Var.f116566b;
        if (w1Var == null || !w1Var.f117269c.d()) {
            return;
        }
        u82Var.f116565a.finish();
    }

    @Override // yads.s82
    public final void destroy() {
        this.f116565a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f116567c);
    }

    @Override // yads.s82
    public final void a() {
        this.f116565a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f116567c);
    }
}
