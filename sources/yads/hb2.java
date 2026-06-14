package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class hb2 {
    public final jb2 a(Context context) {
        jb2 jb2Var;
        jb2 jb2Var2 = jb2.f112282i;
        if (jb2Var2 != null) {
            return jb2Var2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            Object obj = af1.f108670d;
            Executor executorA = ze1.a().a();
            jb2Var = jb2.f112282i;
            if (jb2Var == null) {
                Object obj2 = vt2.f117186j;
                jb2 jb2Var3 = new jb2(applicationContext, executorA, ut2.a(), new gb2(applicationContext.getApplicationContext()), new fb2());
                jb2.f112282i = jb2Var3;
                jb2Var = jb2Var3;
            }
        }
        return jb2Var;
    }
}
