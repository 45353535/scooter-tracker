package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class Df extends C5543xa {
    public Df(int i10) {
        super(i10);
    }

    @Override // io.appmetrica.analytics.impl.C5543xa
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable Z z10) {
        if (z10 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z10.f76726b) + 12;
    }
}
