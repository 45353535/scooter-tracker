package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Vj implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfigB = Wj.b();
            Wj.f37965g = new C3814jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), CollectionsKt.toList(Wj.f37961c));
            C3714fk c3714fk = Wj.f37967i;
            if (c3714fk != null) {
                TelemetryConfig telemetryConfig = Wj.b();
                Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                c3714fk.f38588a = telemetryConfig;
            }
        }
    }
}
