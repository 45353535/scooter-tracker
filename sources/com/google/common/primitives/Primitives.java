package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Primitives {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f31126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f31127b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f31126a = DesugarCollections.unmodifiableMap(linkedHashMap);
        f31127b = DesugarCollections.unmodifiableMap(linkedHashMap2);
    }

    private static void a(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> allPrimitiveTypes() {
        return f31126a.keySet();
    }

    public static Set<Class<?>> allWrapperTypes() {
        return f31127b.keySet();
    }

    public static boolean isWrapperType(Class<?> cls) {
        return f31127b.containsKey(Preconditions.checkNotNull(cls));
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) f31127b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        Class<T> cls2 = (Class) f31126a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
