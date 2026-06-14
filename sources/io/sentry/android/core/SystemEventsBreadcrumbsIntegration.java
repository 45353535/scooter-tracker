package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.sentry.android.core.AppState;
import io.sentry.g7;
import io.sentry.v7;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.r1, Closeable, AppState.a, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile b f82336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f82337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.b1 f82338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f82339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f82340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f82341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile IntentFilter f82342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile HandlerThread f82343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f82344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.util.a f82345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f82346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Handler f82347n;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f82348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Boolean f82349b;

        a(Integer num, Boolean bool) {
            this.f82348a = num;
            this.f82349b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.w.a(this.f82348a, aVar.f82348a) && io.sentry.util.w.a(this.f82349b, aVar.f82349b);
        }

        public int hashCode() {
            return io.sentry.util.w.b(this.f82348a, this.f82349b);
        }
    }

    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.b1 f82350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SentryAndroidOptions f82351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.android.core.internal.util.o f82352c = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.a(), 60000, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f82353d = new char[64];

        b(io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
            this.f82350a = b1Var;
            this.f82351b = sentryAndroidOptions;
        }

        private io.sentry.e a(long j10, Intent intent, String str, a aVar) {
            Bundle extras;
            io.sentry.e eVar = new io.sentry.e(j10);
            eVar.y("system");
            eVar.u("device.event");
            String strB = b(str);
            if (strB != null) {
                eVar.v("action", strB);
            }
            if (aVar != null) {
                if (aVar.f82348a != null) {
                    eVar.v("level", aVar.f82348a);
                }
                if (aVar.f82349b != null) {
                    eVar.v("charging", aVar.f82349b);
                }
            } else if (this.f82351b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f82351b.getLogger().b(g7.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                eVar.v(HandleInvocationsFromAdViewer.KEY_EXTRAS, map);
            }
            eVar.w(g7.INFO);
            return eVar;
        }

        String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.f82353d.length;
            for (int i10 = length - 1; i10 >= 0; i10--) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '.') {
                    char[] cArr = this.f82353d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.d0.d(str);
                }
                length2--;
                this.f82353d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f82352c.a()) {
                    return;
                }
                Float fE = l1.e(intent, this.f82351b);
                a aVar2 = new a(fE != null ? Integer.valueOf(fE.intValue()) : null, l1.v(intent, this.f82351b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f82346m)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f82346m = aVar2;
                aVar = aVar2;
            }
            io.sentry.e eVarA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.i0 i0Var = new io.sentry.i0();
            i0Var.k("android:intent", intent);
            this.f82350a.a(eVarA, i0Var);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, o(), null);
    }

    public static /* synthetic */ void d(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarD = systemEventsBreadcrumbsIntegration.f82345l.d();
        try {
            if (!systemEventsBreadcrumbsIntegration.f82340g && !systemEventsBreadcrumbsIntegration.f82341h && systemEventsBreadcrumbsIntegration.f82336c == null) {
                systemEventsBreadcrumbsIntegration.f82336c = systemEventsBreadcrumbsIntegration.new b(b1Var, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f82342i == null) {
                    systemEventsBreadcrumbsIntegration.f82342i = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f82339f) {
                        systemEventsBreadcrumbsIntegration.f82342i.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f82347n == null && systemEventsBreadcrumbsIntegration.f82343j == null) {
                    systemEventsBreadcrumbsIntegration.f82343j = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f82343j.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.f82347n;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.f82343j.getLooper());
                    }
                    c1.s(systemEventsBreadcrumbsIntegration.f82335b, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f82336c, systemEventsBreadcrumbsIntegration.f82342i, handler);
                    if (!systemEventsBreadcrumbsIntegration.f82344k.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(g7.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.o.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().a(g7.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th3) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static String[] o() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void p(final io.sentry.b1 b1Var, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f82340g && !this.f82341h && this.f82336c == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.d(this.f82625b, b1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(g7.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void q() {
        SentryAndroidOptions sentryAndroidOptions = this.f82337d;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.j2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82620b.s();
                }
            });
        } catch (RejectedExecutionException unused) {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        io.sentry.g1 g1VarD = this.f82345l.d();
        try {
            this.f82341h = true;
            b bVar = this.f82336c;
            this.f82336c = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            if (bVar != null) {
                this.f82335b.unregisterReceiver(bVar);
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.r1
    public void c(io.sentry.b1 b1Var, v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(v7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) v7Var : null, "SentryAndroidOptions is required");
        this.f82337d = sentryAndroidOptions;
        this.f82338e = b1Var;
        sentryAndroidOptions.getLogger().c(g7.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f82337d.isEnableSystemEventBreadcrumbs()));
        if (this.f82337d.isEnableSystemEventBreadcrumbs()) {
            AppState.n().f(this);
            if (c1.r()) {
                p(this.f82338e, this.f82337d);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarD = this.f82345l.d();
        try {
            this.f82340g = true;
            this.f82342i = null;
            if (this.f82343j != null) {
                this.f82343j.quit();
            }
            this.f82343j = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            AppState.n().q(this);
            q();
            SentryAndroidOptions sentryAndroidOptions = this.f82337d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(g7.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.AppState.a
    public void m() {
        if (this.f82338e == null || this.f82337d == null) {
            return;
        }
        this.f82341h = false;
        p(this.f82338e, this.f82337d);
    }

    @Override // io.sentry.android.core.AppState.a
    public void n() {
        q();
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.f82340g = false;
        this.f82341h = false;
        this.f82342i = null;
        this.f82343j = null;
        this.f82344k = new AtomicBoolean(false);
        this.f82345l = new io.sentry.util.a();
        this.f82347n = null;
        this.f82335b = c1.f(context);
        this.f82339f = strArr;
        this.f82347n = handler;
    }
}
