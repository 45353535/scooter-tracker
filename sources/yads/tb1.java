package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class tb1 {
    public static sb1 a(Context context, pr3 pr3Var) {
        Context applicationContext = context.getApplicationContext();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(applicationContext);
        if (hr2VarA == null || !hr2VarA.F) {
            return new ao(applicationContext, new fg1(applicationContext), new ag1(), new rb1(pr3Var));
        }
        fg1 fg1Var = new fg1(applicationContext);
        ag1 ag1Var = new ag1();
        rb1 rb1Var = new rb1(pr3Var);
        Object obj2 = bc1.f108963c;
        return new gs(applicationContext, fg1Var, ag1Var, rb1Var, ac1.a(), new dg2());
    }
}
