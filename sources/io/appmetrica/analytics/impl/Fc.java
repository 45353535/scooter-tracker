package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: loaded from: classes12.dex */
public final class Fc extends Q2 {
    public Fc(Context context, Gf gf2, ReporterConfig reporterConfig, Bi bi2, T9 t92) {
        this(context, bi2, new Kh(gf2, new CounterConfiguration(reporterConfig), new I8(new C5504vl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), t92, C5186j4.l().n(), new Tn(), new Jg(), new C6(), new C5028d0(), new Oe(t92));
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[ManualReporter]";
    }

    public Fc(Context context, Bi bi2, Kh kh2, T9 t92, C5564y6 c5564y6, Tn tn, Jg jg2, C6 c62, C5028d0 c5028d0, Oe oe2) {
        super(context, bi2, kh2, t92, c5564y6, tn, jg2, c62, c5028d0, oe2);
        C5186j4.l().getClass();
    }
}
