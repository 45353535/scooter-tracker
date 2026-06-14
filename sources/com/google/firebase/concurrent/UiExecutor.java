package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public enum UiExecutor implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f31879b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f31879b.post(runnable);
    }
}
