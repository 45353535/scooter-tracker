package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5409s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f78196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f78197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5451ti f78198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L7 f78199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5255ll f78200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I2 f78201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5205jn f78202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4997bl f78203h;

    public C5409s1(C5533x0 c5533x0, I2 i22, C5255ll c5255ll, Io io2, C5205jn c5205jn, C5451ti c5451ti, L7 l72, C4997bl c4997bl) {
        this.f78196a = c5533x0;
        this.f78197b = io2;
        this.f78198c = c5451ti;
        this.f78199d = l72;
        this.f78201f = i22;
        this.f78202g = c5205jn;
        this.f78200e = c5255ll;
        this.f78203h = c4997bl;
    }

    public static IHandlerExecutor c() {
        return C5186j4.l().f77467c.a();
    }

    public final void a(@NonNull final Context context, @NonNull final AppMetricaConfig appMetricaConfig) {
        I2 i22 = this.f78201f;
        i22.f75896f.a(context);
        i22.f75892b.a(appMetricaConfig);
        C5205jn c5205jn = this.f78202g;
        Context applicationContext = context.getApplicationContext();
        c5205jn.f77570e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c5205jn.f77569d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c5205jn.f77566a.getClass();
        C5508w0 c5508w0A = C5508w0.a(applicationContext);
        c5508w0A.f78479d.a(appMetricaConfig, c5508w0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.uq
            @Override // java.lang.Runnable
            public final void run() {
                this.f78403b.b(context, appMetricaConfig);
            }
        });
        this.f78196a.getClass();
        C5533x0.b();
    }

    @Nullable
    public final String b() {
        this.f78196a.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        if (c5508w0 == null) {
            return null;
        }
        return c5508w0.f().e();
    }

    public final C5371qc d() {
        this.f78196a.getClass();
        return C5508w0.f78473e.f().i();
    }

    public final void e() {
        d().f78069a.a(this.f78203h.a());
    }

    public final void f() {
        this.f78201f.f75891a.a(null);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new U0(this));
    }

    public final void c(@Nullable Activity activity) {
        this.f78201f.f75891a.a(null);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5080f1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C5533x0 c5533x0 = this.f78196a;
        Context applicationContext = context.getApplicationContext();
        c5533x0.getClass();
        C5508w0 c5508w0A = C5508w0.a(applicationContext);
        c5508w0A.f().b(this.f78199d.a(appMetricaConfig));
        Context context2 = c5508w0A.f78476a;
        ((G9) C5186j4.l().f77467c.a()).execute(new RunnableC5484v1(context2));
    }

    public final void e(@Nullable String str) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new S0(this, str));
    }

    public final void d(@NonNull String str) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75900j.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new N0(this, str));
    }

    public C5409s1() {
        this(C5186j4.l().d(), new Io());
    }

    public final void c(@NonNull String str, @Nullable String str2) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75909s.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5285n1(this, str, str2));
    }

    public C5409s1(C5533x0 c5533x0, Io io2) {
        this(c5533x0, new I2(c5533x0), new C5255ll(c5533x0), io2, new C5205jn(c5533x0, io2), C5451ti.a(), C5186j4.l().j(), C5186j4.l().o());
    }

    public final void d(@NonNull String str, @Nullable String str2) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        if (i22.f75905o.a(str).f78248a) {
            this.f78202g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5003c1(this, str, str2));
        }
    }

    public final void b(@NonNull String str) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75909s.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5260m1(this, str));
    }

    public final void c(boolean z10) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new P0(this, z10));
    }

    public final void a(@Nullable Activity activity) {
        this.f78201f.f75891a.a(null);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5235l1(this, activity));
    }

    public final void b(@NonNull Activity activity) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75893c.a(activity);
        this.f78202g.getClass();
        Intent intentA = C5205jn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new K0(this, intentA));
    }

    public final void c(@NonNull String str) {
        if (this.f78200e.a((Void) null).f78248a && this.f78201f.f75904n.a(str).f78248a) {
            this.f78202g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5029d1(this, str));
        }
    }

    public final void a(@NonNull Application application) {
        this.f78201f.f75895e.a(application);
        this.f78202g.f77568c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.sq
            @Override // java.lang.Runnable
            public final void run() {
                this.f78250b.e();
            }
        });
    }

    public final void b(boolean z10) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new R0(this, z10));
    }

    public final void b(@NonNull String str, @Nullable String str2) {
        this.f78201f.f75902l.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC4951a1(this, str, str2));
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75909s.a(str);
        this.f78202g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5310o1(this, str, listFromMap));
    }

    public final void b(@NonNull final Object... objArr) {
        this.f78201f.f75891a.a(null);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.tq
            @Override // java.lang.Runnable
            public final void run() {
                C5409s1.a(objArr);
            }
        });
    }

    public final void a(@NonNull String str, @Nullable Throwable th2) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75910t.a(str);
        this.f78202g.getClass();
        if (th2 == null) {
            th2 = new W1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5335p1(this, str, th2));
    }

    public final void b(@NonNull Context context) {
        this.f78201f.f75896f.a(context);
        this.f78202g.f77570e.a(context);
        this.f78196a.getClass();
        C5508w0.a(context);
    }

    public final void a(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75911u.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5360q1(this, str, str2, th2));
    }

    public final void a(@NonNull Throwable th2) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75912v.a(th2);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5384r1(this, th2));
    }

    public final void a(@NonNull String str) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75899i.a(str);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new L0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75894d.a(intent);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new M0(this, intent));
    }

    public final void a(@Nullable Location location) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new O0(this, location));
    }

    public final void a(boolean z10) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Q0(this, z10));
    }

    public final void a(@NonNull UserProfile userProfile) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75913w.a(userProfile);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new T0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75914x.a(revenue);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new V0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75915y.a(adRevenue);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new W0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75916z.a(eCommerceEvent);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new X0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75897g.a(deferredDeeplinkParametersListener);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Y0(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75897g.a(deferredDeeplinkListener);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new Z0(this, deferredDeeplinkListener));
    }

    @NonNull
    public final Ya a(@NonNull Context context, @NonNull String str) {
        I2 i22 = this.f78201f;
        i22.f75896f.a(context);
        i22.f75901k.a(str);
        C5205jn c5205jn = this.f78202g;
        c5205jn.f77570e.a(context.getApplicationContext());
        return this.f78198c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        I2 i22 = this.f78201f;
        i22.f75896f.a(context);
        i22.f75898h.a(reporterConfig);
        C5205jn c5205jn = this.f78202g;
        c5205jn.f77570e.a(context.getApplicationContext());
        C5451ti c5451ti = this.f78198c;
        Context applicationContext = context.getApplicationContext();
        if (((C5252li) c5451ti.f78302a.get(reporterConfig.apiKey)) == null) {
            synchronized (c5451ti.f78302a) {
                try {
                    if (((C5252li) c5451ti.f78302a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorA = C5186j4.l().f77467c.a();
                        c5451ti.f78303b.getClass();
                        if (C5508w0.f78473e == null) {
                            ((G9) iHandlerExecutorA).f75815b.post(new RunnableC5401ri(c5451ti, applicationContext));
                        }
                        C5252li c5252li = new C5252li(applicationContext.getApplicationContext(), str, new C5533x0());
                        c5451ti.f78302a.put(str, c5252li);
                        c5252li.a(reporterConfig);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75903m.a(webView);
        Io io2 = this.f78202g.f77567b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo = new Fo();
                synchronized (io2) {
                    try {
                        PublicLogger publicLogger = io2.f75970b;
                        if (publicLogger == null) {
                            io2.f75969a.add(fo);
                        } else {
                            fo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                io2.a(new Go());
            }
        } catch (Throwable th2) {
            io2.a(new Ho(th2));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC4977b1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f78201f.f75896f.a(context);
        C5205jn c5205jn = this.f78202g;
        Context applicationContext = context.getApplicationContext();
        c5205jn.f77570e.a(applicationContext);
        c5205jn.f77571f.a(applicationContext);
        return C5186j4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5054e1(this, str, str2));
    }

    public final void a() {
        this.f78201f.getClass();
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5106g1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        I2 i22 = this.f78201f;
        i22.f75896f.a(context);
        i22.f75906p.a(startupParamsCallback);
        C5205jn c5205jn = this.f78202g;
        c5205jn.f77570e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5132h1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75907q.a(anrListener);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5158i1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        I2 i22 = this.f78201f;
        i22.f75891a.a(null);
        i22.f75908r.a(externalAttribution);
        this.f78202g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5183j1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C5186j4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f78201f.A.a(map);
        this.f78202g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((G9) iHandlerExecutorC).f75815b.post(new RunnableC5209k1(this, listFromMap));
    }

    public static Pa a(C5409s1 c5409s1) {
        return c5409s1.d().f78069a;
    }
}
