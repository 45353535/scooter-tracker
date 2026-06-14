package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5136h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77290a;

    public C5136h5(String str) {
        this.f77290a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f77290a);
    }
}
