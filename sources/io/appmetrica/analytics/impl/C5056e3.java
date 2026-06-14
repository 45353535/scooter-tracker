package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5056e3 extends Hi {
    public C5056e3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Hi
    @Nullable
    public final Object a(int i10) {
        return Boolean.valueOf(this.f75869a.getResources().getBoolean(i10));
    }

    @Nullable
    public final Boolean b(int i10) {
        return Boolean.valueOf(this.f75869a.getResources().getBoolean(i10));
    }
}
