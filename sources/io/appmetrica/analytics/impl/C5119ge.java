package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5119ge implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77258a;

    public C5119ge(@NonNull String str) {
        this.f77258a = str;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return new so(this, true, "");
        }
        return new so(this, false, this.f77258a + " is empty.");
    }
}
