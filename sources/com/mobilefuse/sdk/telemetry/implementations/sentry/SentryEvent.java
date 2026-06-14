package com.mobilefuse.sdk.telemetry.implementations.sentry;

import androidx.collection.b;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\u008b\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryEvent;", "", PglCryptUtils.KEY_MESSAGE, "", "exception", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "modules", "", "extra", "release", "culprit", "breadcrumbs", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryBreadcrumbs;", "platform", "timestamp", "", "eventId", "(Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryBreadcrumbs;Ljava/lang/String;JLjava/lang/String;)V", "getBreadcrumbs", "()Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryBreadcrumbs;", "getCulprit", "()Ljava/lang/String;", "getEventId", "getException", "()Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "getExtra", "()Ljava/util/Map;", "getMessage", "getModules", "getPlatform", "getRelease", "getTimestamp", "()J", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class SentryEvent {

    @Nullable
    private final SentryBreadcrumbs breadcrumbs;

    @Nullable
    private final String culprit;

    @NotNull
    private final String eventId;

    @NotNull
    private final SentryException exception;

    @NotNull
    private final Map<String, String> extra;

    @NotNull
    private final String message;

    @NotNull
    private final Map<String, String> modules;

    @NotNull
    private final String platform;

    @Nullable
    private final String release;
    private final long timestamp;

    public SentryEvent(@NotNull String message, @NotNull SentryException exception, @NotNull Map<String, String> modules, @NotNull Map<String, String> extra, @Nullable String str, @Nullable String str2, @Nullable SentryBreadcrumbs sentryBreadcrumbs, @NotNull String platform, long j10, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.message = message;
        this.exception = exception;
        this.modules = modules;
        this.extra = extra;
        this.release = str;
        this.culprit = str2;
        this.breadcrumbs = sentryBreadcrumbs;
        this.platform = platform;
        this.timestamp = j10;
        this.eventId = eventId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SentryEvent copy$default(SentryEvent sentryEvent, String str, SentryException sentryException, Map map, Map map2, String str2, String str3, SentryBreadcrumbs sentryBreadcrumbs, String str4, long j10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sentryEvent.message;
        }
        if ((i10 & 2) != 0) {
            sentryException = sentryEvent.exception;
        }
        if ((i10 & 4) != 0) {
            map = sentryEvent.modules;
        }
        if ((i10 & 8) != 0) {
            map2 = sentryEvent.extra;
        }
        if ((i10 & 16) != 0) {
            str2 = sentryEvent.release;
        }
        if ((i10 & 32) != 0) {
            str3 = sentryEvent.culprit;
        }
        if ((i10 & 64) != 0) {
            sentryBreadcrumbs = sentryEvent.breadcrumbs;
        }
        if ((i10 & 128) != 0) {
            str4 = sentryEvent.platform;
        }
        if ((i10 & 256) != 0) {
            j10 = sentryEvent.timestamp;
        }
        if ((i10 & 512) != 0) {
            str5 = sentryEvent.eventId;
        }
        String str6 = str5;
        long j11 = j10;
        SentryBreadcrumbs sentryBreadcrumbs2 = sentryBreadcrumbs;
        String str7 = str4;
        String str8 = str2;
        String str9 = str3;
        return sentryEvent.copy(str, sentryException, map, map2, str8, str9, sentryBreadcrumbs2, str7, j11, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SentryException getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.modules;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCulprit() {
        return this.culprit;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SentryBreadcrumbs getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final SentryEvent copy(@NotNull String message, @NotNull SentryException exception, @NotNull Map<String, String> modules, @NotNull Map<String, String> extra, @Nullable String release, @Nullable String culprit, @Nullable SentryBreadcrumbs breadcrumbs, @NotNull String platform, long timestamp, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new SentryEvent(message, exception, modules, extra, release, culprit, breadcrumbs, platform, timestamp, eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentryEvent)) {
            return false;
        }
        SentryEvent sentryEvent = (SentryEvent) other;
        return Intrinsics.areEqual(this.message, sentryEvent.message) && Intrinsics.areEqual(this.exception, sentryEvent.exception) && Intrinsics.areEqual(this.modules, sentryEvent.modules) && Intrinsics.areEqual(this.extra, sentryEvent.extra) && Intrinsics.areEqual(this.release, sentryEvent.release) && Intrinsics.areEqual(this.culprit, sentryEvent.culprit) && Intrinsics.areEqual(this.breadcrumbs, sentryEvent.breadcrumbs) && Intrinsics.areEqual(this.platform, sentryEvent.platform) && this.timestamp == sentryEvent.timestamp && Intrinsics.areEqual(this.eventId, sentryEvent.eventId);
    }

    @Nullable
    public final SentryBreadcrumbs getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @Nullable
    public final String getCulprit() {
        return this.culprit;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final SentryException getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> getModules() {
        return this.modules;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getRelease() {
        return this.release;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        SentryException sentryException = this.exception;
        int iHashCode2 = (iHashCode + (sentryException != null ? sentryException.hashCode() : 0)) * 31;
        Map<String, String> map = this.modules;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.extra;
        int iHashCode4 = (iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str2 = this.release;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.culprit;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SentryBreadcrumbs sentryBreadcrumbs = this.breadcrumbs;
        int iHashCode7 = (iHashCode6 + (sentryBreadcrumbs != null ? sentryBreadcrumbs.hashCode() : 0)) * 31;
        String str4 = this.platform;
        int iHashCode8 = (((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + b.a(this.timestamp)) * 31;
        String str5 = this.eventId;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SentryEvent(message=" + this.message + ", exception=" + this.exception + ", modules=" + this.modules + ", extra=" + this.extra + ", release=" + this.release + ", culprit=" + this.culprit + ", breadcrumbs=" + this.breadcrumbs + ", platform=" + this.platform + ", timestamp=" + this.timestamp + ", eventId=" + this.eventId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SentryEvent(String str, SentryException sentryException, Map map, Map map2, String str2, String str3, SentryBreadcrumbs sentryBreadcrumbs, String str4, long j10, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String strW;
        Map mapEmptyMap = (i10 & 4) != 0 ? MapsKt.emptyMap() : map;
        Map mapEmptyMap2 = (i10 & 8) != 0 ? MapsKt.emptyMap() : map2;
        String str6 = (i10 & 16) != 0 ? null : str2;
        String str7 = (i10 & 32) != 0 ? null : str3;
        SentryBreadcrumbs sentryBreadcrumbs2 = (i10 & 64) != 0 ? null : sentryBreadcrumbs;
        String str8 = (i10 & 128) != 0 ? "java" : str4;
        long jCurrentTimeMillis = (i10 & 256) != 0 ? System.currentTimeMillis() / ((long) 1000) : j10;
        if ((i10 & 512) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "UUID.randomUUID().toString()");
            strW = StringsKt.W(string, TokenBuilder.TOKEN_DELIMITER, "", false, 4, null);
        } else {
            strW = str5;
        }
        this(str, sentryException, mapEmptyMap, mapEmptyMap2, str6, str7, sentryBreadcrumbs2, str8, jCurrentTimeMillis, strW);
    }
}
