package yads;

import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements h2, wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f111027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f111028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jz1 f111029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9 f111030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2 f111031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c4 f111032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hr2 f111033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lw0 f111034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qw0 f111035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bx0 f111036k;

    public g2(Context context, RelativeLayout relativeLayout, Window window, jz1 jz1Var, t9 t9Var, q2 q2Var, b2 b2Var, c4 c4Var, es2 es2Var, int i10, hr2 hr2Var, lw0 lw0Var, qw0 qw0Var) {
        this.f111026a = context;
        this.f111027b = relativeLayout;
        this.f111028c = window;
        this.f111029d = jz1Var;
        this.f111030e = t9Var;
        this.f111031f = q2Var;
        this.f111032g = c4Var;
        this.f111033h = hr2Var;
        this.f111034i = lw0Var;
        this.f111035j = qw0Var;
        this.f111036k = new gx0(context, t9Var, relativeLayout, this, b2Var, i10, q2Var, c4Var, es2Var).a(context, jz1Var, this);
    }

    @Override // yads.h2
    public final void a() {
        ((q2) this.f111031f).a(2, null);
    }

    @Override // yads.h2
    public final void b() {
        ((q2) this.f111031f).a(3, null);
    }

    @Override // yads.h2
    public final void c() {
        if (this.f111032g.f109194a != qz.f115226i) {
            this.f111027b.setBackground(s9.f115720a);
        }
        this.f111036k.c();
        ((q2) this.f111031f).a(0, null);
        ((q2) this.f111031f).a(5, null);
        boolean z10 = lb1.f113032a;
    }

    @Override // yads.h2
    public final boolean d() {
        lw0 lw0Var = this.f111034i;
        lw0Var.getClass();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(lw0Var.f113238a);
        return hr2VarA != null && hr2VarA.f111751s;
    }

    @Override // yads.wy
    public final void e() {
        ((q2) this.f111031f).f114851a.finish();
    }

    @Override // yads.h2
    public final void f() {
        hr2 hr2Var;
        ((q2) this.f111031f).a(this.f111026a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f111028c.requestFeature(1);
        this.f111028c.addFlags(1024);
        this.f111028c.addFlags(16777216);
        if (this.f111030e.F || ((hr2Var = this.f111033h) != null && hr2Var.E0)) {
            qw0 qw0Var = this.f111035j;
            Window window = this.f111028c;
            qw0Var.getClass();
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
        this.f111035j.a(this.f111028c, this.f111027b);
    }

    @Override // yads.h2
    public final void g() {
        this.f111036k.invalidate();
    }

    @Override // yads.h2
    public final void onAdClosed() {
        this.f111029d.destroy();
        ((q2) this.f111031f).a(4, null);
    }
}
