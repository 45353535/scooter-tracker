package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f28786b;

    t() {
        this.f28786b = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f28786b;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource d() {
        return this.f28786b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public t(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f28786b = taskCompletionSource;
    }
}
