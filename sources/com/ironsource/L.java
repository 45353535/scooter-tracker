package com.ironsource;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final L f41219a = new L();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, Long> f41220b = new HashMap<>();

    private L() {
    }

    @NotNull
    public final HashMap<String, Long> a() {
        return f41220b;
    }

    public final long b(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l10 = f41220b.get(instance);
        if (l10 != null) {
            return System.currentTimeMillis() - l10.longValue();
        }
        return -1L;
    }

    public final long c(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l10 = f41220b.get(instance);
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    public final boolean a(@NotNull String instance, long j10) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f41220b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j10));
        return true;
    }

    public final boolean a(@NotNull String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> map = f41220b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
