package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5544xb implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable String str) {
        return str == null ? new so(this, false, "key is null") : str.startsWith("appmetrica") ? new so(this, false, "key starts with appmetrica") : str.length() > 200 ? new so(this, false, "key length more then 200 characters") : new so(this, true, "");
    }
}
