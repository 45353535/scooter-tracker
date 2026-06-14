package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class A0 implements Ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia f75475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4965af f75476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sl f75477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5325og f75478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gf f75479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5327oi f75480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bi f75481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L7 f75482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4997bl f75483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile C5371qc f75484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5259m0 f75485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f75486m;

    @WorkerThread
    public A0(@NotNull Context context, @NotNull Ia ia2) {
        this.f75474a = context;
        this.f75475b = ia2;
        C4965af c4965afB = C5186j4.l().b(context);
        this.f75476c = c4965afB;
        ArrayList arrayListA = C5596zd.a();
        C5186j4 c5186j4L = C5186j4.l();
        c5186j4L.m().a(new S3(context));
        B0.a(context).a(arrayListA);
        Gf gfA = B0.a(context, B0.a(ia2.b(), this));
        this.f75479f = gfA;
        L7 l7J = c5186j4L.j();
        this.f75482i = l7J;
        Bi biA = B0.a(gfA, context, ia2.getDefaultExecutor());
        this.f75481h = biA;
        l7J.a(biA);
        Sl slA = B0.a(context, biA, c4965afB, ia2.b());
        this.f75477d = slA;
        biA.a(slA);
        this.f75478e = B0.a(biA, c4965afB, ia2.b());
        this.f75480g = B0.a(context, gfA, biA, ia2.b(), slA);
        this.f75483j = c5186j4L.o();
        this.f75485l = new C5259m0(c4965afB);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    @NotNull
    public final Ya c(@NotNull ReporterConfig reporterConfig) {
        return this.f75480g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @AnyThread
    @NotNull
    public final C5063ea d() {
        return this.f75477d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @AnyThread
    @Nullable
    public final String e() {
        return this.f75477d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @AnyThread
    @Nullable
    public final Map<String, String> g() {
        return this.f75477d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @AnyThread
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.f75477d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @AnyThread
    @Nullable
    public final C5371qc i() {
        return this.f75484k;
    }

    public final Pa j() {
        C5371qc c5371qc = this.f75484k;
        Intrinsics.checkNotNull(c5371qc);
        return c5371qc.f78069a;
    }

    @AnyThread
    @NotNull
    public final C5327oi k() {
        return this.f75480g;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void setDataSendingEnabled(boolean z10) {
        j().setDataSendingEnabled(z10);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C5259m0 c5259m0 = this.f75485l;
        C5458u0 c5458u0 = c5259m0.f77727b;
        c5458u0.getClass();
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c5458u0.f78315a.b() && Intrinsics.areEqual(c5458u0.f78316b.f77510a, Boolean.TRUE)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        builderNewConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        AppMetricaConfig.Builder builderF = c5259m0.f77726a.f();
        if (builderF != null) {
            if (builderF.build().advIdentifiersTracking == null && (bool = appMetricaConfigBuild.advIdentifiersTracking) != null) {
                builderF.withAdvIdentifiersTracking(bool.booleanValue());
            }
            appMetricaConfigBuild = builderF.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigBuild, new C5583z0(this, appMetricaConfigBuild, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z10;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new C5558y0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (zA || this.f75486m) {
            z10 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z10 = true;
        }
        if (zA || z10) {
            this.f75476c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z10) {
            ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f75486m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.H6
    @AnyThread
    public final void a(int i10, @NotNull Bundle bundle) {
        this.f75477d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f75478e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f75478e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.f75480g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @WorkerThread
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f75477d.a(startupParamsCallback, list, AbstractC5295nb.c(this.f75479f.f75824a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Dc dc2, boolean z10) {
        if (this.f75484k == null) {
            a(publicLogger, appMetricaConfig, z10);
            this.f75478e.a();
            C5321oc c5321ocA = dc2.a();
            G7 g72 = new G7(c5321ocA);
            C5371qc c5371qc = new C5371qc(c5321ocA, g72);
            this.f75475b.c().a(g72);
            this.f75484k = c5371qc;
            C5438t5 c5438t5 = this.f75483j.f76920b;
            synchronized (c5438t5) {
                try {
                    c5438t5.f78258a = c5321ocA;
                    Iterator it = c5438t5.f78259b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5145he) it.next()).consume(c5321ocA);
                    }
                    c5438t5.f78259b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        dc2.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z10) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f75475b.d().a(this.f75474a, appMetricaConfig, this);
            this.f75475b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f75475b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f75483j.a();
        } else {
            C4997bl c4997bl = this.f75483j;
            synchronized (c4997bl) {
                if (c4997bl.f76925g) {
                    c4997bl.f76919a.unregisterListener(c4997bl.f76921c, ActivityEvent.RESUMED);
                    c4997bl.f76919a.unregisterListener(c4997bl.f76922d, ActivityEvent.PAUSED);
                    c4997bl.f76925g = false;
                }
            }
        }
        this.f75479f.d(appMetricaConfig);
        Sl sl = this.f75477d;
        sl.f76458e = publicLogger;
        sl.b(appMetricaConfig.customHosts);
        Sl sl2 = this.f75477d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        sl2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f75477d.a(str);
        if (str != null) {
            this.f75477d.b("api");
        }
        this.f75481h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z10));
        this.f75477d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void a(boolean z10) {
        j().a(z10);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void a(boolean z10, boolean z11) {
        j().a(z10, z11);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    @WorkerThread
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.InterfaceC4961ab
    public final Za a() {
        return this.f75480g;
    }
}
