package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class S5 extends BaseRequestConfig.DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C5204jm f76392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f76393b;

    public S5(@NonNull C5204jm c5204jm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c5204jm.c(), c5204jm.a(), c5204jm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f76392a = c5204jm;
        this.f76393b = sdkEnvironmentProvider;
    }
}
