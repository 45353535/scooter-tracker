package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r72 implements vv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s72 f115358a;

    public r72(fv1 fv1Var) {
        this.f115358a = fv1Var;
    }

    @Override // yads.vv0
    public final void a() {
        fv1 fv1Var = (fv1) this.f115358a;
        synchronized (fv1Var) {
            try {
                fv1Var.f110948m.size();
                boolean z10 = lb1.f113032a;
                fv1Var.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = fv1Var.f110948m.iterator();
                while (it.hasNext()) {
                    p53 p53Var = (p53) it.next();
                    h93 h93VarA = fv1Var.a(p53Var);
                    if (h93VarA instanceof f93) {
                        it.remove();
                        fv1Var.a(p53Var, (f93) h93VarA);
                    } else if (h93VarA instanceof e93) {
                        e93 e93Var = (e93) h93VarA;
                        fv1Var.f110937b.a(p53Var.f114565d, e93Var);
                        arrayList.add(new u72(p53Var, e93Var));
                    }
                }
                fv1Var.f110937b.a(arrayList);
                fv1Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
