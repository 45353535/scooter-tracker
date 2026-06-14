package com.amazon.aps.ads.util;

import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0006J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J3\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00142\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00122\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0014¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0012¢\u0006\u0002\u0010\u0019R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/aps/ads/util/ApsInMemoryManager;", "", "<init>", "()V", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "putPref", "", C4240b4.i.W, "value", "removePref", "reset", "contains", "", "get", "type", "Ljava/lang/Class;", "getOrDefault", "T", "defaultVal", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "getPrefWithDefault", "clazz", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsInMemoryManager {

    @NotNull
    public static final ApsInMemoryManager INSTANCE = new ApsInMemoryManager();

    @NotNull
    private final HashMap<String, Object> map = new HashMap<>();

    private ApsInMemoryManager() {
    }

    public final synchronized boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.containsKey(key);
    }

    @Nullable
    public final synchronized Object get(@NotNull String key, @NotNull Class<?> type) {
        Object obj;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            if (!this.map.containsKey(key) || (obj = this.map.get(key)) == null) {
                return null;
            }
            if (!(obj instanceof Long) || !Intrinsics.areEqual(Long.TYPE, type)) {
                if ((!(obj instanceof Float) || !Intrinsics.areEqual(Float.TYPE, type)) && ((!(obj instanceof Boolean) || !Intrinsics.areEqual(Boolean.TYPE, type)) && ((!(obj instanceof Integer) || !Intrinsics.areEqual(Integer.TYPE, type)) && ((!(obj instanceof String) || !Intrinsics.areEqual(String.class, type)) && !Intrinsics.areEqual(obj.getClass(), type))))) {
                    throw new IllegalArgumentException("Default and storage type are not same");
                }
            }
            return obj;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final <T> Object getOrDefault(@NotNull String key, @NotNull Class<T> type, @Nullable T defaultVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = get(key, type);
        return obj == null ? defaultVal : obj;
    }

    @Nullable
    public final synchronized <T> T getPrefWithDefault(@NotNull String key, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this.map.containsKey(key)) {
            return (T) get(key, clazz);
        }
        T t10 = (T) null;
        if (!clazz.isAssignableFrom(String.class) && !clazz.isAssignableFrom(Set.class) && !clazz.isAssignableFrom(a1.f93282a.getClass()) && !Intrinsics.areEqual(clazz, String.class)) {
            if (clazz.isAssignableFrom(Boolean.TYPE) || clazz.isAssignableFrom(m.f93316a.getClass()) || Intrinsics.areEqual(clazz, Boolean.class)) {
                t10 = (T) Boolean.FALSE;
            } else if (clazz.isAssignableFrom(Long.TYPE) || clazz.isAssignableFrom(c0.f93287a.getClass()) || Intrinsics.areEqual(clazz, Long.class)) {
                t10 = (T) 0L;
            } else if (clazz.isAssignableFrom(Integer.TYPE) || clazz.isAssignableFrom(a0.f93281a.getClass()) || Intrinsics.areEqual(clazz, Integer.class)) {
                t10 = (T) 0;
            } else if (clazz.isAssignableFrom(Float.TYPE) || clazz.isAssignableFrom(u.f93332a.getClass()) || Intrinsics.areEqual(clazz, Float.class)) {
                t10 = (T) Float.valueOf(0.0f);
            }
        }
        return t10;
    }

    public final synchronized void putPref(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            this.map.put(key, value);
        }
    }

    public final synchronized void removePref(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.map.containsKey(key)) {
            this.map.remove(key);
        }
    }

    public final synchronized void reset() {
        this.map.clear();
    }
}
