package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e12 implements ex1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky1 f110159a;

    public e12(ky1 ky1Var) {
        this.f110159a = ky1Var;
    }

    @Override // yads.ex1
    public final void a(Context context, dx1 dx1Var, hg2 hg2Var, cx1 cx1Var, jy1 jy1Var, rx1 rx1Var, tx1 tx1Var) {
        List list = dx1Var.f110104a.f115232a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jz1 jz1VarA = this.f110159a.a(context, dx1Var, hg2Var, cx1Var, jy1Var, rx1Var, (rw1) it.next());
            if (jz1VarA != null) {
                arrayList.add(jz1VarA);
            }
        }
        if (arrayList.isEmpty()) {
            tx1Var.a(f9.f110640a);
        } else {
            tx1Var.a(arrayList);
        }
    }

    public /* synthetic */ e12(es2 es2Var) {
        this(new ky1(es2Var));
    }
}
