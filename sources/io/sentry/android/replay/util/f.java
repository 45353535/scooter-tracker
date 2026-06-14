package io.sentry.android.replay.util;

import io.sentry.f1;
import io.sentry.g7;
import io.sentry.v7;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Future b(f1 f1Var, final v7 options, final String taskName, final Runnable task) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return f1Var.submit(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().a(g7.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable, v7 v7Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Failed to execute task " + str, th2);
        }
    }
}
