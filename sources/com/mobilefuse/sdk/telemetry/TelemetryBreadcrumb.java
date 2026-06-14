package com.mobilefuse.sdk.telemetry;

import androidx.collection.b;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "", PglCryptUtils.KEY_MESSAGE, "", "category", "data", "", "timestamp", "", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "logType", "wasReported", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLcom/mobilefuse/sdk/telemetry/LogLevel;Ljava/lang/String;Z)V", "getCategory", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getLogLevel", "()Lcom/mobilefuse/sdk/telemetry/LogLevel;", "getLogType", "getMessage", "getTimestamp", "()J", "getWasReported", "()Z", "setWasReported", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TelemetryBreadcrumb {

    @NotNull
    private final String category;

    @Nullable
    private final Map<String, Object> data;

    @NotNull
    private final LogLevel logLevel;

    @NotNull
    private final String logType;

    @NotNull
    private final String message;
    private final long timestamp;
    private boolean wasReported;

    public TelemetryBreadcrumb(@NotNull String message, @NotNull String category, @Nullable Map<String, ? extends Object> map, long j10, @NotNull LogLevel logLevel, @NotNull String logType, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(logType, "logType");
        this.message = message;
        this.category = category;
        this.data = map;
        this.timestamp = j10;
        this.logLevel = logLevel;
        this.logType = logType;
        this.wasReported = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelemetryBreadcrumb copy$default(TelemetryBreadcrumb telemetryBreadcrumb, String str, String str2, Map map, long j10, LogLevel logLevel, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = telemetryBreadcrumb.message;
        }
        if ((i10 & 2) != 0) {
            str2 = telemetryBreadcrumb.category;
        }
        if ((i10 & 4) != 0) {
            map = telemetryBreadcrumb.data;
        }
        if ((i10 & 8) != 0) {
            j10 = telemetryBreadcrumb.timestamp;
        }
        if ((i10 & 16) != 0) {
            logLevel = telemetryBreadcrumb.logLevel;
        }
        if ((i10 & 32) != 0) {
            str3 = telemetryBreadcrumb.logType;
        }
        if ((i10 & 64) != 0) {
            z10 = telemetryBreadcrumb.wasReported;
        }
        boolean z11 = z10;
        LogLevel logLevel2 = logLevel;
        long j11 = j10;
        Map map2 = map;
        return telemetryBreadcrumb.copy(str, str2, map2, j11, logLevel2, str3, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLogType() {
        return this.logType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getWasReported() {
        return this.wasReported;
    }

    @NotNull
    public final TelemetryBreadcrumb copy(@NotNull String message, @NotNull String category, @Nullable Map<String, ? extends Object> data, long timestamp, @NotNull LogLevel logLevel, @NotNull String logType, boolean wasReported) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(logType, "logType");
        return new TelemetryBreadcrumb(message, category, data, timestamp, logLevel, logType, wasReported);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryBreadcrumb)) {
            return false;
        }
        TelemetryBreadcrumb telemetryBreadcrumb = (TelemetryBreadcrumb) other;
        return Intrinsics.areEqual(this.message, telemetryBreadcrumb.message) && Intrinsics.areEqual(this.category, telemetryBreadcrumb.category) && Intrinsics.areEqual(this.data, telemetryBreadcrumb.data) && this.timestamp == telemetryBreadcrumb.timestamp && Intrinsics.areEqual(this.logLevel, telemetryBreadcrumb.logLevel) && Intrinsics.areEqual(this.logType, telemetryBreadcrumb.logType) && this.wasReported == telemetryBreadcrumb.wasReported;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Map<String, Object> getData() {
        return this.data;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final String getLogType() {
        return this.logType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean getWasReported() {
        return this.wasReported;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.message;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.data;
        int iHashCode3 = (((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + b.a(this.timestamp)) * 31;
        LogLevel logLevel = this.logLevel;
        int iHashCode4 = (iHashCode3 + (logLevel != null ? logLevel.hashCode() : 0)) * 31;
        String str3 = this.logType;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.wasReported;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode5 + r12;
    }

    public final void setWasReported(boolean z10) {
        this.wasReported = z10;
    }

    @NotNull
    public String toString() {
        return "TelemetryBreadcrumb(message=" + this.message + ", category=" + this.category + ", data=" + this.data + ", timestamp=" + this.timestamp + ", logLevel=" + this.logLevel + ", logType=" + this.logType + ", wasReported=" + this.wasReported + ")";
    }

    public /* synthetic */ TelemetryBreadcrumb(String str, String str2, Map map, long j10, LogLevel logLevel, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i10 & 8) != 0 ? System.currentTimeMillis() : j10, (i10 & 16) != 0 ? LogLevel.INFO : logLevel, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? false : z10);
    }
}
