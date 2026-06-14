package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5568ya extends C5543xa {
    public C5568ya(int i10, int i11) {
        this(i10, new C5593za(i11));
    }

    public final int a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C5543xa
    public final int b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    @VisibleForTesting
    public C5568ya(int i10, @NonNull C5593za c5593za) {
        super(i10, c5593za);
    }
}
