package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Enums {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f28869a = new WeakHashMap();

    @GwtIncompatible
    private static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class f28870d;

        StringConverter(Class cls) {
            this.f28870d = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                return this.f28870d.equals(((StringConverter) obj).f28870d);
            }
            return false;
        }

        public int hashCode() {
            return this.f28870d.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(Enum r12) {
            return r12.name();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Enum g(String str) {
            return Enum.valueOf(this.f28870d, str);
        }

        public String toString() {
            return "Enums.stringConverter(" + this.f28870d.getName() + ".class)";
        }
    }

    static Map a(Class cls) {
        Map mapB;
        Map map = f28869a;
        synchronized (map) {
            try {
                mapB = (Map) map.get(cls);
                if (mapB == null) {
                    mapB = b(cls);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapB;
    }

    private static Map b(Class cls) {
        HashMap map = new HashMap();
        for (Enum r22 : EnumSet.allOf(cls)) {
            map.put(r22.name(), new WeakReference(r22));
        }
        f28869a.put(cls, map);
        return map;
    }

    @GwtIncompatible
    public static Field getField(Enum<?> r12) {
        try {
            return r12.getDeclaringClass().getDeclaredField(r12.name());
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static <T extends Enum<T>> Optional<T> getIfPresent(Class<T> cls, String str) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(str);
        return Platform.d(cls, str);
    }

    @GwtIncompatible
    public static <T extends Enum<T>> Converter<String, T> stringConverter(Class<T> cls) {
        return new StringConverter(cls);
    }
}
