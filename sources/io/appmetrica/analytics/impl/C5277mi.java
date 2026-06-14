package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5277mi implements Ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ue f77763a = new Ue();

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC4987bb
    public final void a(@NonNull Sn sn) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f77763a;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
    }

    public void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC5105g0
    public final void a(@NonNull V v10) {
    }

    public void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
    }
}
