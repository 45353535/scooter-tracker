package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class C0 implements Ja {
    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.H6
    public final void a(int i10, @NonNull Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @NonNull
    public final Ya c(@NonNull ReporterConfig reporterConfig) {
        return new C5277mi();
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @NonNull
    public final C5063ea d() {
        return new C5063ea();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @Nullable
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @Nullable
    public final Map<String, String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @NonNull
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.Ja
    @Nullable
    public final C5371qc i() {
        Ec ec2 = new Ec();
        return new C5371qc(ec2, new G7(ec2));
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10, boolean z11) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.InterfaceC4961ab
    @NonNull
    public final Za a() {
        return new C5352pi();
    }
}
