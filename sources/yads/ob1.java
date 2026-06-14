package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ob1 implements xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f114252b;

    public ob1(Context context, es2 es2Var) {
        this.f114251a = context;
        this.f114252b = es2Var;
    }

    @Override // yads.xw0
    public final cx0 a(t9 t9Var, c4 c4Var, nw0 nw0Var) {
        return new nb1(this.f114251a, t9Var, c4Var, this.f114252b, nw0Var, new vz1(c4Var));
    }
}
