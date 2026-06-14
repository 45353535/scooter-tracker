package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5025cn implements vo {
    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        return !TextUtils.isEmpty(s82.f76409b) ? StringUtils.getUTF8Bytes(s82.f76409b) : new byte[0];
    }
}
