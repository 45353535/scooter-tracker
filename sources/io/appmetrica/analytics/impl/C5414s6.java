package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5414s6 implements InterfaceC4987bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5439t6 f78216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kh f78217b;

    public C5414s6(@NotNull C5439t6 c5439t6) {
        this.f78216a = c5439t6;
        this.f78217b = c5439t6.a();
        C5186j4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4987bb
    public final void a(@NotNull Sn sn) {
        Bi bi2 = this.f78216a.f78260a;
        Ah ahA = bi2.a(sn, this.f78217b);
        Kh kh2 = ahA.f75527e;
        Tl tl = bi2.f75596e;
        if (tl != null) {
            kh2.f76218b.setUuid(((Sl) tl).g());
        } else {
            kh2.getClass();
        }
        bi2.f75594c.b(ahA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + sn, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Kh kh2 = this.f78217b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (kh2) {
                    I8 i82 = kh2.f76024c;
                    i82.f75927b.b(i82.f75926a, key, value);
                }
            }
        }
    }
}
