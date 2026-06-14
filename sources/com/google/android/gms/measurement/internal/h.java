package com.google.android.gms.measurement.internal;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ Map.Entry a(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
