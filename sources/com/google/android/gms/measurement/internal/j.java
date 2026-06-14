package com.google.android.gms.measurement.internal;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ Set a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
