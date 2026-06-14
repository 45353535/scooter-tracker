package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class so2 implements xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f115889b;

    public so2(Context context, es2 es2Var) {
        this.f115888a = context;
        this.f115889b = es2Var;
    }

    @Override // yads.xw0
    public final cx0 a(t9 t9Var, c4 c4Var, nw0 nw0Var) {
        Context context = this.f115888a;
        es2 es2Var = this.f115889b;
        si2 si2Var = new si2();
        return new ro2(context, t9Var, c4Var, es2Var, nw0Var, si2Var, new kp2(si2Var), new vz1(c4Var), new uq2(c4Var, es2Var));
    }
}
