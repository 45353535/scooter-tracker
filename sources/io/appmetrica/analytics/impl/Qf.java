package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Qf implements vo, D8 {
    @Override // io.appmetrica.analytics.impl.D8
    public final int a(@NonNull N8 n82) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.vo
    @NonNull
    public final byte[] a(@NonNull S8 s82, @NonNull C5351ph c5351ph) {
        return TextUtils.isEmpty(s82.f76409b) ? new byte[0] : Base64.decode(s82.f76409b, 0);
    }
}
