package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Vj implements Ya, IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f76602a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C5252li f76603b;

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC4987bb
    public final void a(@NonNull Sn sn) {
        a(new Ej(sn));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        a(new Qj());
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        a(new C5577yj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        a(new Pj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        a(new Fj(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        a(new Nj(map));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        a(new Cj(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        a(new C5477uj(str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        a(new Sj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        a(new Bj(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        a(new C5527wj(th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        a(new Aj(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        a(new C5552xj());
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        a(new Rj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        a(new Dj(z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        a(new Lj(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        a(new C5602zj(str));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC5105g0
    public final void a(@NonNull V v10) {
        a(new Oj(v10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        a(new Mj(adRevenue, z10));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        a(new C5502vj(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        a(new Tj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        a(new Gj(pluginErrorDetails));
    }

    public final void a(@NotNull Yj yj) {
        a(new Jj(yj));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @NonNull Throwable th2) {
        a(new C5502vj(str, str2, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        a(new Uj(str, map));
    }

    public final synchronized void a(Xa xa2) {
        try {
            if (this.f76603b == null) {
                this.f76602a.add(xa2);
            } else {
                xa2.a(this.f76603b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        a(new Hj(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        a(new Kj(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        a(new Ij(str, str2, pluginErrorDetails));
    }
}
