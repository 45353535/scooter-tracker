package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lu1 implements zz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu1 f113227a;

    public lu1(iu1 iu1Var) {
        this.f113227a = iu1Var;
    }

    @Override // yads.zz0
    public final void a(u92 u92Var, Map map) {
        zz0 zz0Var;
        iu1 iu1Var = this.f113227a;
        u92 u92Var2 = iu1Var.f112139a;
        l23 l23Var = new l23(u92Var2);
        iu1Var.f112142d.getClass();
        xi3 xi3Var = new xi3(ti3.a(u92Var2));
        mo0 mo0VarA = iu1Var.f112144f.a(iu1Var.f112139a);
        oo0 oo0Var = new oo0(mo0VarA.f113566a, mo0VarA.f113567b);
        mi3 mi3Var = mi3.f113514c;
        iu1Var.f112155q = mi3Var;
        iu1Var.f112140b.a(mi3Var, xi3Var, oo0Var, l23Var);
        iu1Var.f112140b.b("notifyReadyEvent();");
        tu1 tu1Var = iu1Var.f112150l;
        if (tu1Var == null || (zz0Var = (zz0) tu1Var.f116389a.get()) == null) {
            return;
        }
        zz0Var.a(u92Var, map);
    }

    @Override // yads.zz0
    public final void a(String str) throws fu1 {
        this.f113227a.b(str);
    }

    @Override // yads.zz0
    public final void a() {
        this.f113227a.a();
    }

    @Override // yads.zz0
    public final void a(boolean z10) {
        iu1 iu1Var = this.f113227a;
        iu1Var.getClass();
        iu1Var.f112140b.a(new xi3(z10));
        if (z10) {
            qo0 qo0Var = iu1Var.f112148j;
            if (qo0Var.f115111e == null) {
                po0 po0Var = new po0(qo0Var.f115110d, qo0Var.f115107a, qo0Var.f115108b, qo0Var.f115109c);
                qo0Var.f115111e = po0Var;
                qo0Var.f115110d.post(po0Var);
                return;
            }
            return;
        }
        qo0 qo0Var2 = iu1Var.f112148j;
        qo0Var2.f115110d.removeCallbacksAndMessages(null);
        qo0Var2.f115111e = null;
        mo0 mo0VarA = iu1Var.f112144f.a(iu1Var.f112139a);
        if (Intrinsics.areEqual(mo0VarA, iu1Var.f112156r)) {
            return;
        }
        iu1Var.f112156r = mo0VarA;
        iu1Var.f112140b.a(new oo0(mo0VarA.f113566a, mo0VarA.f113567b));
    }
}
