package sg.bigo.ads.common.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.f.a;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f102319a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102320b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f102321c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Application f102322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f102323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<a, Object> f102324f;

    public interface a {
        void a(Activity activity);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.b$b, reason: collision with other inner class name */
    static class C1259b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f102343a = new b(0);
    }

    private b() {
        this.f102324f = new WeakHashMap();
    }

    public static Application a() {
        return f102322d;
    }

    @Nullable
    public static Activity b() {
        WeakReference<Activity> weakReference = C1259b.f102343a.f102323e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static int c() {
        int i10;
        if (!f102319a || (i10 = f102321c) < 0) {
            return 0;
        }
        return i10 > 0 ? 1 : 2;
    }

    public static boolean d() {
        return f102321c > 0;
    }

    public static boolean e() {
        return f102320b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        f102320b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f102324f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull final Activity activity) {
        f102320b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f102324f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull final Activity activity) {
        this.f102323e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f102324f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull final Activity activity) {
        this.f102323e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f102324f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (f102321c == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            aVarA.b();
            if (aVarA.f102318d != null && aVarA.c()) {
                aVarA.f102318d.a(aVarA.f102316b, aVarA.f102317c);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter foreground.");
        }
        f102321c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        int i10 = f102321c - 1;
        f102321c = i10;
        if (i10 == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            if (aVarA.f102318d != null && aVarA.c()) {
                a.InterfaceC1258a interfaceC1258a = aVarA.f102318d;
                boolean z10 = aVarA.f102315a;
                long j10 = aVarA.f102316b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = aVarA.f102317c;
                System.currentTimeMillis();
                interfaceC1258a.a(z10, j10, jElapsedRealtime, j11);
            }
            aVarA.f102315a = false;
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter background.");
        }
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C1259b.f102343a.f102324f.remove(aVar);
            }
        });
    }

    public static synchronized void a(@NonNull Application application) {
        if (f102319a) {
            return;
        }
        f102319a = true;
        f102320b = 0;
        f102321c = 0;
        f102322d = application;
        application.registerActivityLifecycleCallbacks(C1259b.f102343a);
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C1259b.f102343a.f102324f.put(aVar, C1259b.f102343a);
            }
        });
    }
}
