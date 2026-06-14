package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ko implements InterfaceC5432t {
    @Override // io.appmetrica.analytics.impl.InterfaceC5432t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.put("source", "yandex");
        return map;
    }
}
