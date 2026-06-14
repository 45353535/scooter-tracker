package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5377qi implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f78089a;

    public C5377qi(@NonNull Map<String, ?> map) {
        this.f78089a = map;
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final so a(@Nullable String str) {
        return this.f78089a.containsKey(str) ? new so(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new so(this, true, "");
    }
}
