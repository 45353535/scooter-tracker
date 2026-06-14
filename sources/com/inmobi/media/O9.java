package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class O9 implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CrashConfig) {
            La la2 = P9.f37530d;
            CrashConfig crashConfig = (CrashConfig) config;
            la2.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
            la2.f37273a = crashConfig;
            R9 r92 = la2.f37275c;
            r92.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "config");
            r92.f37647a.f36953a = crashConfig.getCrashConfig().getSamplingPercent();
            r92.f37648b.f36953a = crashConfig.getCatchConfig().getSamplingPercent();
            r92.f37649c.f36953a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            r92.f37650d.f36953a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            C3850l6 c3850l6 = la2.f37274b;
            if (c3850l6 != null) {
                C3623c6 eventConfig = crashConfig.getEventConfig();
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c3850l6.f38954j = eventConfig;
            }
            C4073u5 c4073u5 = P9.f37529c;
            if (c4073u5 != null) {
                Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
                c4073u5.f39635a = crashConfig;
            }
        }
    }
}
