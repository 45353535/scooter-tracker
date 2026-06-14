package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5131h0 implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new so(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new so(this, true, "");
        } catch (Throwable unused) {
            return new so(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
