package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class kp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lp2 f112802a;

    public kp2(si2 si2Var) {
        this.f112802a = si2Var;
    }

    public final jp2 a(Context context, t9 t9Var, es2 es2Var, c4 c4Var) {
        lo2 lo2Var;
        if (t9Var != null && (lo2Var = t9Var.f116125r) != null) {
            if (lo2Var.f113179b) {
                lv2 lv2Var = lo2Var.f113181d;
                if (lv2Var != null) {
                    return new jv2(lv2Var, new xa(context, es2Var, c4Var));
                }
            } else {
                bv bvVar = lo2Var.f113180c;
                if (bvVar != null) {
                    return new zu(this.f112802a, new tt2(bvVar.f109120b, bvVar.f109121c));
                }
            }
        }
        return null;
    }
}
