package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su f118467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l02 f118468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f118469c;

    public yz1(su suVar, l02 l02Var, Map map) {
        this.f118467a = suVar;
        this.f118468b = l02Var;
        this.f118469c = map;
    }

    public final void a() {
        for (hi hiVar : this.f118469c.values()) {
            if (hiVar != null) {
                hiVar.a();
            }
        }
    }

    public final View b() {
        return this.f118468b.a();
    }

    public final hi a(gi giVar) {
        if (giVar != null) {
            return (hi) this.f118469c.get(giVar.f111213a);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yz1(m02 m02Var, c4 c4Var, es2 es2Var, hg2 hg2Var, g41 g41Var, su suVar, jy1 jy1Var, ui uiVar, r22 r22Var, u12 u12Var, t9 t9Var, y52 y52Var, rx1 rx1Var, mm1 mm1Var, zv2 zv2Var, f20 f20Var) {
        l02 l02VarA = m02Var.a();
        this(suVar, l02VarA, new ji(l02VarA, hg2Var, new fm1(uiVar, c4Var, g41Var, jy1Var.c(), rx1Var, mm1Var, new wk3(l02VarA), zv2Var), r22Var, u12Var, t9Var, y52Var, ((pr3) es2Var).a(), f20Var).a());
    }
}
