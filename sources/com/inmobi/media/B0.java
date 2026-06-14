package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class B0 implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        A0 a02;
        Intrinsics.checkNotNullParameter(config, "config");
        if ((config instanceof AdConfig) && (a02 = E0.f36763b) != null) {
            AdConfig adConfig = (AdConfig) config;
            Intrinsics.checkNotNullParameter(adConfig, "adConfig");
            if (a02.f36535a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                a02.f36535a.set(false);
                CoroutineScope coroutineScope = E0.f36767f;
                if (coroutineScope != null) {
                    kotlinx.coroutines.i.d(coroutineScope, new CancellationException("Shutdown"));
                }
                E0.f36767f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || a02.f36535a.get()) {
                return;
            }
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) Y3.f38021a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                a02.a();
            }
        }
    }
}
