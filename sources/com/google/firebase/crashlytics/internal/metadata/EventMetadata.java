package com.google.firebase.crashlytics.internal.metadata;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "timestamp", "", "additionalCustomKeys", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/Map;", MenuActionType.COPY, "(Ljava/lang/String;JLjava/util/Map;)Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSessionId", "b", "J", "getTimestamp", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/Map;", "getAdditionalCustomKeys", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map additionalCustomKeys;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMetadata(@NotNull String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventMetadata.sessionId;
        }
        if ((i10 & 2) != 0) {
            j10 = eventMetadata.timestamp;
        }
        if ((i10 & 4) != 0) {
            map = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(str, j10, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.additionalCustomKeys;
    }

    @NotNull
    public final EventMetadata copy(@NotNull String sessionId, long timestamp, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        return new EventMetadata(sessionId, timestamp, additionalCustomKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return Intrinsics.areEqual(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && Intrinsics.areEqual(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    @NotNull
    public final Map<String, String> getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + androidx.collection.b.a(this.timestamp)) * 31) + this.additionalCustomKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    public EventMetadata(@NotNull String sessionId, long j10, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.sessionId = sessionId;
        this.timestamp = j10;
        this.additionalCustomKeys = additionalCustomKeys;
    }

    public /* synthetic */ EventMetadata(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
