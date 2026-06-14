package com.mobilefuse.sdk.logging;

import com.mobilefuse.sdk.DebuggingKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/sdk/logging/HttpRequestTracker;", "", "()V", "enabled", "", "getEnabled$annotations", "getEnabled", "()Z", "setEnabled", "(Z)V", "logs", "", "Lcom/mobilefuse/sdk/logging/HttpRequestEvent;", "getLogs$annotations", "clearLogs", "", "getLogs", "", "logHttpRequest", "url", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class HttpRequestTracker {
    private static boolean enabled;

    @NotNull
    public static final HttpRequestTracker INSTANCE = new HttpRequestTracker();
    private static final List<HttpRequestEvent> logs = new ArrayList();

    private HttpRequestTracker() {
    }

    public static final void clearLogs() {
        logs.clear();
    }

    public static final boolean getEnabled() {
        return enabled;
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    @NotNull
    public static final List<HttpRequestEvent> getLogs() {
        return CollectionsKt.toList(logs);
    }

    private static /* synthetic */ void getLogs$annotations() {
    }

    public static final void logHttpRequest(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (enabled) {
            logs.add(new HttpRequestEvent(new Date(), url));
            String str = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
            DebuggingKt.logDebug(INSTANCE, "TimeStamp: " + str + " URL: " + url, "[HttpRequestTracker]");
        }
    }

    public static final void setEnabled(boolean z10) {
        enabled = z10;
    }
}
