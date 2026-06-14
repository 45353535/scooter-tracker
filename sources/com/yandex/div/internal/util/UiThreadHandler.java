package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/internal/util/UiThreadHandler;", "", "<init>", "()V", "Ljava/lang/Thread;", "mainThread", "()Ljava/lang/Thread;", "", "isMainThread", "()Z", "Landroid/os/Handler;", "get", "()Landroid/os/Handler;", "Lkotlin/Function0;", "", "runnable", "postOnMainThread", "(Lkotlin/jvm/functions/Function0;)Z", "INSTANCE$1", "Landroid/os/Handler;", "INSTANCE", "utils_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UiThreadHandler {

    @NotNull
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();

    /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
    @NotNull
    private static final Handler INSTANCE = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    @NotNull
    public static final Handler get() {
        return INSTANCE;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Thread.currentThread(), mainThread());
    }

    @NotNull
    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }

    public final boolean postOnMainThread(@NotNull final Function0<Unit> runnable) {
        return INSTANCE.post(new Runnable() { // from class: a8.a
            @Override // java.lang.Runnable
            public final void run() {
                runnable.invoke();
            }
        });
    }
}
