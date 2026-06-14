package org.bidon.sdk.utils.ext;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"(\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\r\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"(\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\r\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"SystemTimeNow", "", "getSystemTimeNow", "()J", "ElapsedMonotonicTimeNow", "getElapsedMonotonicTimeNow", "SystemTimeNowTestOnly", "getSystemTimeNowTestOnly$annotations", "()V", "getSystemTimeNowTestOnly", "()Ljava/lang/Long;", "setSystemTimeNowTestOnly", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "ElapsedMonotonicTimeNowTestOnly", "getElapsedMonotonicTimeNowTestOnly$annotations", "getElapsedMonotonicTimeNowTestOnly", "setElapsedMonotonicTimeNowTestOnly", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LocalDateTimeExtKt {

    @Nullable
    private static Long ElapsedMonotonicTimeNowTestOnly;

    @Nullable
    private static Long SystemTimeNowTestOnly;

    public static final long getElapsedMonotonicTimeNow() {
        Long l10 = ElapsedMonotonicTimeNowTestOnly;
        return l10 != null ? l10.longValue() : SystemClock.elapsedRealtime();
    }

    @Nullable
    public static final Long getElapsedMonotonicTimeNowTestOnly() {
        return ElapsedMonotonicTimeNowTestOnly;
    }

    @VisibleForTesting
    public static /* synthetic */ void getElapsedMonotonicTimeNowTestOnly$annotations() {
    }

    public static final long getSystemTimeNow() {
        Long l10 = SystemTimeNowTestOnly;
        return l10 != null ? l10.longValue() : System.currentTimeMillis();
    }

    @Nullable
    public static final Long getSystemTimeNowTestOnly() {
        return SystemTimeNowTestOnly;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSystemTimeNowTestOnly$annotations() {
    }

    public static final void setElapsedMonotonicTimeNowTestOnly(@Nullable Long l10) {
        ElapsedMonotonicTimeNowTestOnly = l10;
    }

    public static final void setSystemTimeNowTestOnly(@Nullable Long l10) {
        SystemTimeNowTestOnly = l10;
    }
}
