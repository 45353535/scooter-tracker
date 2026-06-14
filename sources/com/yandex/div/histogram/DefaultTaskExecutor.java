package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/histogram/DefaultTaskExecutor;", "Lcom/yandex/div/histogram/TaskExecutor;", "()V", "handler", "Landroid/os/Handler;", "post", "", "task", "Lkotlin/Function0;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultTaskExecutor implements TaskExecutor {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(@NotNull final Function0<Unit> task) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            task.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: w7.b
                @Override // java.lang.Runnable
                public final void run() {
                    task.invoke();
                }
            });
        }
    }
}
