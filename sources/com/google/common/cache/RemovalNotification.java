package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RemovalCause f29184b;

    private RemovalNotification(Object obj, Object obj2, RemovalCause removalCause) {
        super(obj, obj2);
        this.f29184b = (RemovalCause) Preconditions.checkNotNull(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> create(K k10, V v10, RemovalCause removalCause) {
        return new RemovalNotification<>(k10, v10, removalCause);
    }

    public RemovalCause getCause() {
        return this.f29184b;
    }

    public boolean wasEvicted() {
        return this.f29184b.g();
    }
}
