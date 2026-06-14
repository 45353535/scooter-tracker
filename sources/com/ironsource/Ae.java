package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ae implements K8 {
    @Override // com.ironsource.K8
    public void a(@NotNull Context context, @NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, i10);
    }

    @Override // com.ironsource.K8
    public int b(@NotNull Context context, @NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, i10);
    }

    @Override // com.ironsource.K8
    public void a(@NotNull Context context, @NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, j10);
    }

    @Override // com.ironsource.K8
    public long b(@NotNull Context context, @NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, j10);
    }
}
