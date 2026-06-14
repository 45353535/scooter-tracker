package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5212k4 implements ClientStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5579yl f77586a;

    public C5212k4(@NotNull InterfaceC5579yl interfaceC5579yl) {
        this.f77586a = interfaceC5579yl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C5066ed(str, this.f77586a);
    }
}
