package com.mobilefuse.sdk.service;

import androidx.core.app.NotificationCompat;
import com.mobilefuse.sdk.DebuggingKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"logServiceDebug", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", NotificationCompat.CATEGORY_MESSAGE, "", "Lcom/mobilefuse/sdk/service/MobileFuseServices;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MobileFuseServices_LogsKt {
    public static final void logServiceDebug(@NotNull MobileFuseServices logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(msg);
        sb2.append(" on thread: ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        DebuggingKt.logDebug(logServiceDebug, sb2.toString(), "MobileFuseServices");
    }

    public static final void logServiceDebug(@NotNull MobileFuseService logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("** Service ");
        sb2.append(logServiceDebug);
        sb2.append(": ");
        sb2.append(msg);
        sb2.append(" on thread: ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        DebuggingKt.logDebug(logServiceDebug, sb2.toString(), "MobileFuseService");
    }
}
