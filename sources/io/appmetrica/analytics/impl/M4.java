package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes12.dex */
public final class M4 extends Kh {
    public M4(Gf gf2) {
        super(gf2, new CounterConfiguration(), new I8(new C5504vl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final boolean f() {
        return true;
    }
}
