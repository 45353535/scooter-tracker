package com.moloco.sdk.acm.eventprocessing;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.f f54005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54006b;

    public e(com.moloco.sdk.acm.services.f timeProviderService, long j10) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f54005a = timeProviderService;
        this.f54006b = j10;
    }

    public final boolean a(com.moloco.sdk.acm.db.b eventEntity) {
        Intrinsics.checkNotNullParameter(eventEntity, "eventEntity");
        return this.f54005a.invoke() - eventEntity.f() >= this.f54006b * ((long) 1000);
    }
}
