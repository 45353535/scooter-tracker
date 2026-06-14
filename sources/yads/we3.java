package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class we3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ti0 f117440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f117441b = new Object();

    public static ti0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        u03 u03Var = new u03(applicationContext);
        Object obj = un0.f116721c;
        er erVarA = tn0.a().a(applicationContext);
        bc0 bc0Var = new bc0(applicationContext, new fs2(((x23) he.a().f116107a).a(), xp2.a().a(applicationContext)));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        ec0 ec0Var = new ec0(u03Var, 0);
        hr hrVar = new hr();
        hrVar.f111708a = erVarA;
        hrVar.f111711d = bc0Var;
        return new ti0(applicationContext, ec0Var, new fc0(hrVar, executorServiceNewFixedThreadPool));
    }

    public static ti0 b(Context context) {
        ti0 ti0VarA;
        ti0 ti0Var = f117440a;
        if (ti0Var != null) {
            return ti0Var;
        }
        synchronized (f117441b) {
            ti0 ti0Var2 = f117440a;
            if (ti0Var2 != null) {
                return ti0Var2;
            }
            try {
                ti0VarA = a(context);
                f117440a = ti0VarA;
            } catch (Throwable th2) {
                th2.toString();
                boolean z10 = lb1.f113032a;
                ti0VarA = null;
            }
            return ti0VarA;
        }
    }
}
