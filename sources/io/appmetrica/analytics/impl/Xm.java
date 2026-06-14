package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Xm extends Hi {
    public Xm(@NotNull Context context, @NotNull String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    public final Object a(int i10) {
        return this.f75869a.getResources().getStringArray(i10);
    }

    @Nullable
    public final String[] b(int i10) {
        return this.f75869a.getResources().getStringArray(i10);
    }
}
