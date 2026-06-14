package com.appodeal.ads.utils;

import android.os.Handler;
import com.appodeal.ads.b6;
import com.appodeal.ads.uc;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15020a = new HashMap();

    public static void a(uc ucVar) {
        if (ucVar != null) {
            HashMap map = f15020a;
            Runnable task = (Runnable) map.get(ucVar);
            if (task != null) {
                Handler handler = b6.f13134a;
                Intrinsics.checkNotNullParameter(task, "task");
                b6.f13134a.removeCallbacks(task);
            }
            map.remove(ucVar);
        }
    }

    public static void b(uc ucVar, g gVar) {
        if (ucVar == null || ucVar.f14937c.f15230g <= 0) {
            return;
        }
        HashMap map = f15020a;
        Runnable task = (Runnable) map.get(ucVar);
        if (task != null) {
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter(task, "task");
            b6.f13134a.removeCallbacks(task);
        }
        map.put(ucVar, new f(ucVar, gVar));
        f task2 = (f) map.get(ucVar);
        if (task2 != null) {
            long jCurrentTimeMillis = task2.f15019d - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                task2.run();
                return;
            }
            Runnable task3 = (Runnable) map.get(ucVar);
            if (task3 != null) {
                Handler handler2 = b6.f13134a;
                Intrinsics.checkNotNullParameter(task3, "task");
                b6.f13134a.removeCallbacks(task3);
            }
            Handler handler3 = b6.f13134a;
            Intrinsics.checkNotNullParameter(task2, "task");
            b6.f13134a.postDelayed(task2, jCurrentTimeMillis);
        }
    }
}
