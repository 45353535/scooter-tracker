package c3;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import b3.c;
import b3.k;
import com.facebook.s;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6501a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f6502b = Process.myUid();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f6503c = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f6504d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Runnable f6505e = new Runnable() { // from class: c3.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Object systemService = s.m().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (e3.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f6502b) {
                        Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        String strG = k.g(thread);
                        if (!Intrinsics.areEqual(strG, f6504d) && k.k(thread)) {
                            f6504d = strG;
                            c.a.a(processErrorStateInfo.shortMsg, strG).g();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final void d() {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            f6503c.scheduleWithFixedDelay(f6505e, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }
}
