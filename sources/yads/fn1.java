package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;

/* JADX INFO: loaded from: classes4.dex */
public final class fn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo1 f110805a;

    public fn1(eo1 eo1Var) {
        this.f110805a = eo1Var;
    }

    public final MediatedAdapterInitializer a(Context context, cp1 cp1Var, es2 es2Var) {
        qz qzVarA = this.f110805a.a(cp1Var);
        if (qzVarA == null) {
            return null;
        }
        new dn1(new jn1(new c4(qzVarA), es2Var, null)).a(context, cp1Var, com.monetization.ads.mediation.base.a.class);
        return null;
    }
}
