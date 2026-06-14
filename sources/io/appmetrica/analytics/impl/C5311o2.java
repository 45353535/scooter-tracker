package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5311o2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    @NotNull
    public final Ma a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC4961ab interfaceC4961ab) {
        return new Gh(new C5271mc(interfaceC4961ab, appMetricaConfig), new InterfaceC5340p6() { // from class: io.appmetrica.analytics.impl.pq
            @Override // io.appmetrica.analytics.impl.InterfaceC5340p6
            public final boolean a(Throwable th2) {
                return C5311o2.a(th2);
            }
        }, appMetricaConfig.crashTransformer, new T9(context));
    }
}
