package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f36768a;

    public static void a(boolean z10) {
        LinkedHashSet linkedHashSet;
        if (Ji.f37157a == null || (linkedHashSet = f36768a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Sk) it.next()).getClass();
                Sk.a(z10);
            } catch (Exception e10) {
                Intrinsics.checkNotNullExpressionValue("E1", "TAG");
                e10.getMessage();
            }
        }
    }

    public static void b(Context context) {
        Sk listener = Yk.f38073c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (f36768a == null) {
            f36768a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new D1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f36768a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("E1", "TAG");
            e10.getMessage();
            return false;
        }
    }
}
