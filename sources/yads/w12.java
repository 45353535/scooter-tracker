package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w12 implements ex1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky1 f117276a;

    public w12(ky1 ky1Var) {
        this.f117276a = ky1Var;
    }

    @Override // yads.ex1
    public final void a(Context context, dx1 dx1Var, hg2 hg2Var, cx1 cx1Var, jy1 jy1Var, rx1 rx1Var, tx1 tx1Var) {
        jz1 jz1VarA;
        List list = dx1Var.f110104a.f115232a;
        if (list == null || list.isEmpty()) {
            jz1VarA = null;
        } else if (list.size() > 1) {
            jz1VarA = cx1Var.a(context, dx1Var, hg2Var, jy1Var, rx1Var);
        } else {
            jz1VarA = this.f117276a.a(context, dx1Var, hg2Var, cx1Var, jy1Var, rx1Var, (rw1) list.get(0));
        }
        if (jz1VarA != null) {
            tx1Var.a(jz1VarA);
        } else {
            tx1Var.a(f9.f110640a);
        }
    }

    public /* synthetic */ w12(es2 es2Var) {
        this(new ky1(es2Var));
    }
}
