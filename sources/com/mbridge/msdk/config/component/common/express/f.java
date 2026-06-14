package com.mbridge.msdk.config.component.common.express;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ Map a(Map.Entry[] entryArr) {
        HashMap map = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        return DesugarCollections.unmodifiableMap(map);
    }
}
