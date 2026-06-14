package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5445tc extends AbstractC5078f {
    public C5445tc(Context context, Gg gg2) {
        super(context, gg2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5078f
    public final void b(@NonNull W5 w52, @NonNull C5512w4 c5512w4) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(c5512w4.f78481b.f78410b, Boolean.FALSE)).booleanValue();
        Rb rbM = C5468ua.H.m();
        rbM.a(zBooleanValue);
        rbM.a(c5512w4.f78481b.f78411c);
        Boolean bool = c5512w4.f78481b.f78422n;
        if (bool != null) {
            C5468ua.H.c().b(bool.booleanValue());
        }
        this.f77138b.a(w52, c5512w4);
    }
}
