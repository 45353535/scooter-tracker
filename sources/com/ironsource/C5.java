package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class C5 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f40469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f40469a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f40469a = new Handler(getLooper());
    }
}
