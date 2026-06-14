package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Q3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(@NotNull Context context) {
        C4976b0 c4976b0B = C5186j4.l().b();
        c4976b0B.f76873c.a().executeDelayed(new C4950a0(c4976b0B, context), c4976b0B.f76874d);
    }
}
