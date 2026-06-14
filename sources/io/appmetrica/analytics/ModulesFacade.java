package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.AbstractC5426si;
import io.appmetrica.analytics.impl.C5272md;
import io.appmetrica.analytics.impl.C5322od;
import io.appmetrica.analytics.impl.C5347pd;
import io.appmetrica.analytics.impl.C5372qd;
import io.appmetrica.analytics.impl.C5396rd;
import io.appmetrica.analytics.impl.C5421sd;
import io.appmetrica.analytics.impl.C5446td;
import io.appmetrica.analytics.impl.C5471ud;
import io.appmetrica.analytics.impl.C5533x0;

/* JADX INFO: loaded from: classes12.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C5471ud f74906a = new C5471ud();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C5471ud c5471ud = f74906a;
        C5272md c5272md = c5471ud.f78379b;
        c5272md.f77758b.a(context);
        c5272md.f77760d.a(str);
        c5471ud.f78380c.f75584a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC5426si.f78240a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.getClass();
        c5471ud.f78380c.getClass();
        c5471ud.f78378a.getClass();
        return C5533x0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.f77757a.a(null);
        c5471ud.f78380c.getClass();
        c5471ud.f78381d.execute(new C5347pd(c5471ud, moduleEvent));
    }

    public static void reportExternalAttribution(int i10, @NonNull String str) {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.getClass();
        c5471ud.f78380c.getClass();
        c5471ud.f78381d.execute(new C5372qd(c5471ud, i10, str));
    }

    public static void sendEventsBuffer() {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.getClass();
        c5471ud.f78380c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.getClass();
        c5471ud.f78380c.getClass();
        c5471ud.f78381d.execute(new C5396rd(c5471ud, z10));
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C5471ud c5471ud) {
        f74906a = c5471ud;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C5471ud c5471ud = f74906a;
        c5471ud.f78379b.f77759c.a(str);
        c5471ud.f78380c.getClass();
        c5471ud.f78381d.execute(new C5421sd(c5471ud, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C5471ud c5471ud = f74906a;
        C5272md c5272md = c5471ud.f78379b;
        c5272md.f77758b.a(context);
        c5272md.f77760d.a(str);
        c5471ud.f78380c.f75584a.a(context.getApplicationContext());
        c5471ud.f78381d.execute(new C5446td(str));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C5471ud c5471ud = f74906a;
        boolean zBooleanValue = bool.booleanValue();
        c5471ud.f78379b.getClass();
        c5471ud.f78380c.getClass();
        c5471ud.f78381d.execute(new C5322od(c5471ud, adRevenue, zBooleanValue));
    }
}
