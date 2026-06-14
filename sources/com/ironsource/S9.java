package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class S9 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f41739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f41739a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(S9 s92, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        s92.a(runnable, j10);
    }

    public final void a(@NotNull Runnable task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f41739a;
        if (handler != null) {
            handler.postDelayed(task, j10);
        }
    }

    public final void a() {
        this.f41739a = new Handler(getLooper());
    }
}
