package yads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class t72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q72 f116102a;

    public /* synthetic */ t72() {
        this(new q72());
    }

    public final fv1 a(Context context, c4 c4Var, es2 es2Var, l41 l41Var, b22 b22Var, String str, ta taVar) {
        p72 ww2Var;
        q72 q72Var = this.f116102a;
        q72Var.getClass();
        int iOrdinal = taVar.ordinal();
        if (iOrdinal == 0) {
            o41 o41Var = q72Var.f114888a;
            ta taVar2 = ta.f116139d;
            o41Var.getClass();
            n41 n41VarA = o41.a(taVar2);
            o41 o41Var2 = q72Var.f114888a;
            ta taVar3 = ta.f116138c;
            o41Var2.getClass();
            ww2Var = new ww2(new r53(l41Var, n41VarA), new r53(l41Var, o41.a(taVar3)));
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new lf.m();
            }
            q72Var.f114888a.getClass();
            ww2Var = new r53(l41Var, o41.a(taVar));
        }
        xa xaVar = new xa(context, es2Var, c4Var);
        Object obj = vt2.f117186j;
        return new fv1(context, ww2Var, b22Var, str, taVar, xaVar, ut2.a(), new x43(ww2Var, Looper.getMainLooper()), new q53());
    }

    public t72(q72 q72Var) {
        this.f116102a = q72Var;
    }
}
