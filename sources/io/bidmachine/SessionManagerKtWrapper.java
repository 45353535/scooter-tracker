package io.bidmachine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/bidmachine/SessionManagerKtWrapper;", "", "sessionManager", "Lio/bidmachine/SessionManager;", "(Lio/bidmachine/SessionManager;)V", "getSessionDurationMs", "", "getSessionStartTime", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SessionManagerKtWrapper {

    @NotNull
    private final SessionManager sessionManager;

    public SessionManagerKtWrapper(@NotNull SessionManager sessionManager) {
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.sessionManager = sessionManager;
    }

    public final /* synthetic */ long getSessionDurationMs() {
        return this.sessionManager.getSessionDurationMs();
    }

    public final /* synthetic */ long getSessionStartTime() {
        return this.sessionManager.getSessionStartTime();
    }
}
