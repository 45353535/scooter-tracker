package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C4950a0;
import io.appmetrica.analytics.impl.C4976b0;
import io.appmetrica.analytics.impl.C5186j4;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaLibraryAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static D0 f74883a = new D0();

    public static void activate(@NonNull Context context) {
        D0 d02 = f74883a;
        if (!d02.f75644a.f75929a.a(context).f78248a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Jb jb2 = d02.f75645b;
        Context applicationContext = context.getApplicationContext();
        jb2.getClass();
        C5186j4.l().f77471g.a(applicationContext);
        C5186j4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f74883a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        D0 d02 = f74883a;
        if (d02.f75644a.f75931c.a((Void) null).f78248a) {
            d02.f75645b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z10);
        }
    }

    @VisibleForTesting
    public static void setProxy(@NonNull D0 d02) {
        f74883a = d02;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        D0 d02 = f74883a;
        d02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Ib ib2 = d02.f75644a;
        if (ib2.f75935g.a(str).f78248a && ib2.f75929a.a(context).f78248a) {
            d02.f75645b.getClass();
            C5186j4.l().f77471g.a(context);
            C4976b0 c4976b0B = C5186j4.l().b();
            c4976b0B.f76873c.a().executeDelayed(new C4950a0(c4976b0B, context), c4976b0B.f76874d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        D0 d02 = f74883a;
        Ib ib2 = d02.f75644a;
        if (ib2.f75929a.a(context).f78248a && ib2.f75930b.a(appMetricaLibraryAdapterConfig).f78248a) {
            Jb jb2 = d02.f75645b;
            Context applicationContext = context.getApplicationContext();
            jb2.getClass();
            C5186j4.l().f77471g.a(applicationContext);
            C5186j4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
