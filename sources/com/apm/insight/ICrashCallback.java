package com.apm.insight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface ICrashCallback {
    void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread);
}
