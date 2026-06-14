package com.google.firebase.sessions;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.AdExperience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "Lcom/google/firebase/sessions/DataCollectionState;", AdExperience.PERFORMANCE, "crashlytics", "", "sessionSamplingRate", "<init>", "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)V", "component1", "()Lcom/google/firebase/sessions/DataCollectionState;", "component2", "component3", "()D", MenuActionType.COPY, "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)Lcom/google/firebase/sessions/DataCollectionStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/firebase/sessions/DataCollectionState;", "getPerformance", "b", "getCrashlytics", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "D", "getSessionSamplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataCollectionStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataCollectionState performance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataCollectionState crashlytics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dataCollectionState = dataCollectionStatus.performance;
        }
        if ((i10 & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.crashlytics;
        }
        if ((i10 & 4) != 0) {
            d10 = dataCollectionStatus.sessionSamplingRate;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    @NotNull
    public final DataCollectionStatus copy(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double sessionSamplingRate) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        return new DataCollectionStatus(performance, crashlytics, sessionSamplingRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) other;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && Double.compare(this.sessionSamplingRate, dataCollectionStatus.sessionSamplingRate) == 0;
    }

    @NotNull
    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    @NotNull
    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + androidx.collection.a.a(this.sessionSamplingRate);
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }

    public DataCollectionStatus(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d10) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d10;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i10 & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
