package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xo2 {
    public static wo2 a(Context context, pr3 pr3Var) {
        Context applicationContext = context.getApplicationContext();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(applicationContext);
        if (hr2VarA == null || !hr2VarA.G) {
            return new ko(applicationContext, new fg1(applicationContext), new ag1(), new vo2(pr3Var));
        }
        fg1 fg1Var = new fg1(applicationContext);
        ag1 ag1Var = new ag1();
        vo2 vo2Var = new vo2(pr3Var);
        Object obj2 = op2.f114384c;
        return new ks(applicationContext, fg1Var, ag1Var, vo2Var, np2.a(), new dg2());
    }
}
