package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f112214a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k1 f112215b;

    public static final void a(Context context) {
        synchronized (f112214a) {
            try {
                if (f112215b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        k1 k1Var = new k1(new o1(activity));
                        f112215b = k1Var;
                        application.registerActivityLifecycleCallbacks(k1Var);
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity a() {
        Activity activityA;
        synchronized (f112214a) {
            k1 k1Var = f112215b;
            activityA = k1Var != null ? k1Var.a() : null;
        }
        return activityA;
    }
}
