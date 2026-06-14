package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class lo implements InterfaceC5331om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f77723a;

    public lo(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f77723a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331om
    public final void a(@NotNull C5204jm c5204jm) {
        this.f77723a.updateConfiguration(new UtilityServiceConfiguration(c5204jm.f77561v, c5204jm.f77560u));
    }
}
