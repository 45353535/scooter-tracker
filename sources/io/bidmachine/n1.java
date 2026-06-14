package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f81834a = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SessionManager.get().pause();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                n1.c(activity);
                io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SessionManager.get().resume();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            try {
                n1.c(activity);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static Activity a() {
        return pd.a0.f98216a.a();
    }

    static void b(Context context) {
        if (f81834a.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    static void c(Activity activity) {
        pd.a0.f98216a.b(activity);
    }
}
