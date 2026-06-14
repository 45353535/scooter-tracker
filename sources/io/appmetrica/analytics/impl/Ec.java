package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Ec extends C5277mi implements Pa {
    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final List<String> f() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C5277mi, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.C5277mi, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ka
    public final void b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ka
    public final void b(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ka
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull Io io2) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull EnumC5283n enumC5283n) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull String str, boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10, boolean z11) {
    }
}
