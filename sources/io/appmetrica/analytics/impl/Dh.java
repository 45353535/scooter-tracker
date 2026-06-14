package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class Dh extends AbstractC5251lh {
    public Dh(L6 l62) {
        super(l62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5251lh, io.appmetrica.analytics.impl.InterfaceC5276mh
    public final boolean a(@Nullable Boolean bool) {
        return !this.f77708a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
