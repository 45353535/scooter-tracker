package com.startapp.sdk.internal;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ui {
    @Nullable
    @DoNotInline
    public static StackTraceElement[] a() {
        return Thread.currentThread().getStackTrace();
    }
}
