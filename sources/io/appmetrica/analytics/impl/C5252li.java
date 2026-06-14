package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5252li implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f77709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fh f77710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f77711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f77712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReporterConfig f77713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5501vi f77714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Te f77715g;

    public C5252li(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C5533x0());
    }

    public static Ya a(C5533x0 c5533x0, Context context, ReporterConfig reporterConfig) {
        c5533x0.getClass();
        return C5508w0.a(context).f().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5174ii(this));
    }

    public final void d(@NonNull String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Yh(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f77715g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Qh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5149hi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f77710b.f75779h.a(adRevenue);
        this.f77714f.getClass();
        this.f77711c.execute(new Uh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f77710b.f75781j.a(map);
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5071ei(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f77710b.f75780i.a(eCommerceEvent);
        this.f77714f.getClass();
        this.f77711c.execute(new Wh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        this.f77710b.f75773b.a(str);
        this.f77714f.getClass();
        if (th2 == null) {
            th2 = new W1();
            th2.fillInStackTrace();
        }
        this.f77711c.execute(new Mh(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f77710b.f75772a.a(str);
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5200ji(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f77710b.f75778g.a(revenue);
        this.f77714f.getClass();
        this.f77711c.execute(new Th(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        this.f77710b.f75776e.a(th2);
        this.f77714f.getClass();
        this.f77711c.execute(new Oh(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f77710b.f75777f.a(userProfile);
        this.f77714f.getClass();
        this.f77711c.execute(new Sh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Ph(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5123gi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Xh(this, z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC4994bi(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Rh(this, str));
    }

    public C5252li(Context context, String str, C5533x0 c5533x0) {
        this(context, new Fh(), c5533x0, new C5501vi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC4987bb
    public final void a(@NonNull Sn sn) {
        this.f77710b.f75775d.a(sn);
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5046di(this, sn));
    }

    public C5252li(Context context, Fh fh2, C5533x0 c5533x0, C5501vi c5501vi, ReporterConfig reporterConfig) {
        this(context, fh2, c5533x0, c5501vi, reporterConfig, new Te(new Vh(c5533x0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        this.f77710b.f75779h.a(adRevenue);
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5020ci(this, adRevenue, z10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        this.f77710b.f75772a.a(str);
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5226ki(this, str, str2));
    }

    public C5252li(Context context, Fh fh2, C5533x0 c5533x0, C5501vi c5501vi, ReporterConfig reporterConfig, Te te2) {
        this.f77711c = C5186j4.l().g().a();
        this.f77712d = context;
        this.f77710b = fh2;
        this.f77709a = c5533x0;
        this.f77714f = c5501vi;
        this.f77713e = reporterConfig;
        this.f77715g = te2;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        this.f77710b.f75774c.a(str);
        this.f77714f.getClass();
        this.f77711c.execute(new Nh(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC5105g0
    public final void a(@NonNull V v10) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC5097fi(this, v10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        this.f77710b.f75772a.a(str);
        this.f77714f.getClass();
        this.f77711c.execute(new Lh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new Zh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f77710b.getClass();
        this.f77714f.getClass();
        this.f77711c.execute(new RunnableC4968ai(this, moduleEvent));
    }
}
