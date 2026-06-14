package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4948b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f75384a;

    public C4948b(@NotNull ServiceContext serviceContext) {
        this.f75384a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f75384a.getActiveNetworkTypeProvider().getNetworkType(this.f75384a.getContext()) == NetworkType.CELL;
    }
}
