package com.my.tracker.plugins;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface MyTrackerPluginConfig {
    @NonNull
    @AnyThread
    String getPluginClass();

    @NonNull
    @AnyThread
    String getPluginName();
}
