package com.mobilefuse.sdk.telemetry;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.y.z.w.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TimedStampedLog;", "", "timeStamp", "Ljava/util/Date;", s.z.f67719y, "", "(Ljava/util/Date;Ljava/lang/String;)V", "getLog", "()Ljava/lang/String;", "getTimeStamp", "()Ljava/util/Date;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TimedStampedLog {

    @NotNull
    private final String log;

    @NotNull
    private final Date timeStamp;

    public TimedStampedLog(@NotNull Date timeStamp, @NotNull String log) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(log, "log");
        this.timeStamp = timeStamp;
        this.log = log;
    }

    public static /* synthetic */ TimedStampedLog copy$default(TimedStampedLog timedStampedLog, Date date, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = timedStampedLog.timeStamp;
        }
        if ((i10 & 2) != 0) {
            str = timedStampedLog.log;
        }
        return timedStampedLog.copy(date, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLog() {
        return this.log;
    }

    @NotNull
    public final TimedStampedLog copy(@NotNull Date timeStamp, @NotNull String log) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(log, "log");
        return new TimedStampedLog(timeStamp, log);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedStampedLog)) {
            return false;
        }
        TimedStampedLog timedStampedLog = (TimedStampedLog) other;
        return Intrinsics.areEqual(this.timeStamp, timedStampedLog.timeStamp) && Intrinsics.areEqual(this.log, timedStampedLog.log);
    }

    @NotNull
    public final String getLog() {
        return this.log;
    }

    @NotNull
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        Date date = this.timeStamp;
        int iHashCode = (date != null ? date.hashCode() : 0) * 31;
        String str = this.log;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimedStampedLog(timeStamp=" + this.timeStamp + ", log=" + this.log + ")";
    }
}
