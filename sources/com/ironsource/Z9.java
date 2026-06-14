package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Z9 f42250a = new Z9();

    private Z9() {
    }

    public static final <T> T a(@Nullable T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String errorMessage, boolean z10) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(errorMessage);
        }
        if (!z10) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new lf.m();
    }
}
