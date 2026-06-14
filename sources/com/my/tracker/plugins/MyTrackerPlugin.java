package com.my.tracker.plugins;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes11.dex */
public interface MyTrackerPlugin {
    @WorkerThread
    void init(@NonNull MyTrackerPluginConfig myTrackerPluginConfig, @NonNull PluginEventTracker pluginEventTracker, @NonNull Application application);
}
