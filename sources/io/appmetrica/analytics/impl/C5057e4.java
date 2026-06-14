package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5057e4 implements ModuleServiceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f77060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77061b;

    public C5057e4(@NotNull SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f77060a = sdkIdentifiers;
        this.f77061b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f77061b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f77060a;
    }
}
