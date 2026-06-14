package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5463u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicLogger f78324a;

    public C5463u5(String str) {
        this.f78324a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i10) {
        if (i10 < 100) {
            this.f78324a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i10 + ". Default value (100) will be used", new Object[0]);
            return 100;
        }
        if (i10 <= 10000) {
            return i10;
        }
        this.f78324a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i10 + ". Default value (10000) will be used", new Object[0]);
        return 10000;
    }
}
