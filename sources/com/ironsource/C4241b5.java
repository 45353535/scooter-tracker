package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4241b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4241b5 f42712a = new C4241b5();

    private C4241b5() {
    }

    private final int a(Context context, int i10) {
        return zf.a.d(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
