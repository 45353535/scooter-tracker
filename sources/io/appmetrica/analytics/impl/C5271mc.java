package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5271mc extends Yn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f77756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5271mc(@NonNull InterfaceC4961ab interfaceC4961ab, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC4961ab);
        String str = appMetricaConfig.apiKey;
        this.f77756b = appMetricaConfig;
    }

    @NonNull
    public final InterfaceC4987bb a() {
        return this.f76724a.a().a(this.f77756b);
    }
}
