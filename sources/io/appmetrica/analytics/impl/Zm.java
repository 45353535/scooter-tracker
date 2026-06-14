package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes12.dex */
public final class Zm extends Hi {
    public Zm(@NonNull Context context, @NonNull String str) {
        super(context, str, TypedValues.Custom.S_STRING);
    }

    @Override // io.appmetrica.analytics.impl.Hi
    @Nullable
    public final Object a(int i10) {
        return this.f75869a.getString(i10);
    }

    @Nullable
    public final String b(int i10) {
        return this.f75869a.getString(i10);
    }
}
