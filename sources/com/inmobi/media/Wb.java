package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wb implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f37946a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f37946a.post(runnable);
    }
}
