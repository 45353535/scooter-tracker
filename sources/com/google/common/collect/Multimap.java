package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CompatibleWith("K") Object obj, @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object obj2);

    boolean containsKey(@CompatibleWith("K") Object obj);

    boolean containsValue(@CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(Object obj);

    Collection<V> get(@ParametricNullness K k10);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    Multiset<K> keys();

    @CanIgnoreReturnValue
    boolean put(@ParametricNullness K k10, @ParametricNullness V v10);

    @CanIgnoreReturnValue
    boolean putAll(Multimap<? extends K, ? extends V> multimap);

    @CanIgnoreReturnValue
    boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable);

    @CanIgnoreReturnValue
    boolean remove(@CompatibleWith("K") Object obj, @CompatibleWith(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@CompatibleWith("K") Object obj);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
