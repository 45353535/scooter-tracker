package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final X1 f42009a = new X1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f42010b = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f42011c = "parsing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f42012d = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f42013e = "disabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f42014f = "-1";

    private X1() {
    }

    @NotNull
    public final String a(boolean z10) {
        if (!z10) {
            return f42014f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(X1 x12, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return x12.a(z10, num);
    }

    @NotNull
    public final String a(boolean z10, @Nullable Integer num) {
        if (z10) {
            return (num != null && num.intValue() == 1003) ? f42011c : (num != null && num.intValue() == 1008) ? f42011c : (num != null && num.intValue() == 1002) ? f42011c : (num != null && num.intValue() == 1006) ? f42010b : (num != null && num.intValue() == 1001) ? f42010b : "other";
        }
        return "disabled";
    }
}
