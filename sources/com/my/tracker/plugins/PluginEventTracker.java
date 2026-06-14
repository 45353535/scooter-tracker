package com.my.tracker.plugins;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.e0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class PluginEventTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f62028b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f62029a;

    private PluginEventTracker(e0 e0Var) {
        this.f62029a = e0Var;
    }

    public static PluginEventTracker a(e0 e0Var) {
        return new PluginEventTracker(e0Var);
    }

    @AnyThread
    public static void onBackground(@NonNull Runnable runnable) {
        f62028b.execute(runnable);
    }

    @AnyThread
    public void trackPluginEvent(int i10, @NonNull byte[] bArr, boolean z10, boolean z11, @Nullable Runnable runnable) {
        this.f62029a.a(i10, bArr, z10, z11, runnable);
    }
}
