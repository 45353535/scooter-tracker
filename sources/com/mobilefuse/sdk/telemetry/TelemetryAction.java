package com.mobilefuse.sdk.telemetry;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "", "sender", "", "type", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", "timestamp", "", "(Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;Ljava/util/List;Lcom/mobilefuse/sdk/telemetry/LogLevel;J)V", "getExtras", "()Ljava/util/List;", "getLogLevel", "()Lcom/mobilefuse/sdk/telemetry/LogLevel;", "getSender", "()Ljava/lang/String;", "getTimestamp", "()J", "setTimestamp", "(J)V", "getType", "()Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TelemetryAction {

    @NotNull
    private final List<TelemetryActionParam> extras;

    @NotNull
    private final LogLevel logLevel;

    @NotNull
    private final String sender;
    private long timestamp;

    @NotNull
    private final TelemetryActionType type;

    public TelemetryAction(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long j10) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.sender = sender;
        this.type = type;
        this.extras = extras;
        this.logLevel = logLevel;
        this.timestamp = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelemetryAction copy$default(TelemetryAction telemetryAction, String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = telemetryAction.sender;
        }
        if ((i10 & 2) != 0) {
            telemetryActionType = telemetryAction.type;
        }
        if ((i10 & 4) != 0) {
            list = telemetryAction.extras;
        }
        if ((i10 & 8) != 0) {
            logLevel = telemetryAction.logLevel;
        }
        if ((i10 & 16) != 0) {
            j10 = telemetryAction.timestamp;
        }
        long j11 = j10;
        return telemetryAction.copy(str, telemetryActionType, list, logLevel, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TelemetryActionType getType() {
        return this.type;
    }

    @NotNull
    public final List<TelemetryActionParam> component3() {
        return this.extras;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryAction copy(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long timestamp) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new TelemetryAction(sender, type, extras, logLevel, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryAction)) {
            return false;
        }
        TelemetryAction telemetryAction = (TelemetryAction) other;
        return Intrinsics.areEqual(this.sender, telemetryAction.sender) && Intrinsics.areEqual(this.type, telemetryAction.type) && Intrinsics.areEqual(this.extras, telemetryAction.extras) && Intrinsics.areEqual(this.logLevel, telemetryAction.logLevel) && this.timestamp == telemetryAction.timestamp;
    }

    @NotNull
    public final List<TelemetryActionParam> getExtras() {
        return this.extras;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final String getSender() {
        return this.sender;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryActionType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.sender;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        TelemetryActionType telemetryActionType = this.type;
        int iHashCode2 = (iHashCode + (telemetryActionType != null ? telemetryActionType.hashCode() : 0)) * 31;
        List<TelemetryActionParam> list = this.extras;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        LogLevel logLevel = this.logLevel;
        return ((iHashCode3 + (logLevel != null ? logLevel.hashCode() : 0)) * 31) + b.a(this.timestamp);
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    @NotNull
    public String toString() {
        return "TelemetryAction(sender=" + this.sender + ", type=" + this.type + ", extras=" + this.extras + ", logLevel=" + this.logLevel + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ TelemetryAction(String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, telemetryActionType, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? LogLevel.INFO : logLevel, (i10 & 16) != 0 ? System.currentTimeMillis() : j10);
    }
}
