package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class m8 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f64912a;

    public m8(Handler handler) {
        this.f64912a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f64912a.post(runnable);
    }
}
