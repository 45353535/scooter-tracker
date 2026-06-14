package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class y42 implements mc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f42 f118075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf3 f118076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc3 f118077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o93 f118078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sc3 f118079e;

    public /* synthetic */ y42(Context context, t9 t9Var, es2 es2Var, f42 f42Var, xb3 xb3Var, v52 v52Var, tc3 tc3Var, fh3 fh3Var, fd3 fd3Var, jf3 jf3Var) {
        this(context, t9Var, es2Var, f42Var, xb3Var, v52Var, tc3Var, fh3Var, fd3Var, jf3Var, new pc3(context, es2Var, tc3Var));
    }

    @Override // yads.mc3
    public final void a(bc2 bc2Var) {
        this.f118079e = bc2Var;
    }

    @Override // yads.mc3
    public final void play() {
        this.f118078d.a();
    }

    @Override // yads.mc3
    public final void stop() {
        o93 o93Var = this.f118078d;
        o93Var.f114239h.a();
        o93Var.f114232a.pauseAd();
        ((do0) this.f118075a).a();
    }

    public y42(Context context, t9 t9Var, es2 es2Var, f42 f42Var, xb3 xb3Var, v52 v52Var, tc3 tc3Var, fh3 fh3Var, fd3 fd3Var, jf3 jf3Var, pc3 pc3Var) {
        this.f118075a = f42Var;
        this.f118076b = jf3Var;
        this.f118077c = pc3Var;
        o93 o93Var = new o93(context, es2Var, new h42(f42Var), v52Var, xb3Var, new h52(v52Var), new xd3(), fh3Var, fd3Var, new x42(this), t9Var, true);
        this.f118078d = o93Var;
        o93Var.a(tc3Var);
    }
}
