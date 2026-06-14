package j$.util;

import java.util.RandomAccess;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public class DesugarCollections {
    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new C5661m(collection);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new C5797u(set);
    }

    public static <T> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T> sortedSet) {
        return new C5799w(sortedSet);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C5663o(list);
        }
        return new C5796t(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new C5666s(map);
    }

    public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> sortedMap) {
        return new C5798v(sortedMap);
    }

    public static <T> java.util.Collection<T> synchronizedCollection(java.util.Collection<T> collection) {
        return new C5655g(collection);
    }

    public static <T> java.util.Collection<T> bridge_synchronizedCollection(java.util.Collection<T> collection, Object obj) {
        return new C5655g(collection, obj);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new C5659k(set);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C5656h(list);
        }
        return new C5658j(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C5657i(map);
    }
}
