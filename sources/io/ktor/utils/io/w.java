package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String taskName, Throwable th2) {
        super("Concurrent " + taskName + " attempts", th2);
        Intrinsics.checkNotNullParameter(taskName, "taskName");
    }
}
