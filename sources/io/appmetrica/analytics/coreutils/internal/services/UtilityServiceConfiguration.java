package io.appmetrica.analytics.coreutils.internal.services;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;", "", "", "component1", "component2", "initialConfigTime", "lastUpdateConfigTime", MenuActionType.COPY, "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getInitialConfigTime", "()J", "b", "getLastUpdateConfigTime", "<init>", "(JJ)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class UtilityServiceConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long initialConfigTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long lastUpdateConfigTime;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = utilityServiceConfiguration.initialConfigTime;
        }
        if ((i10 & 2) != 0) {
            j11 = utilityServiceConfiguration.lastUpdateConfigTime;
        }
        return utilityServiceConfiguration.copy(j10, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInitialConfigTime() {
        return this.initialConfigTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastUpdateConfigTime() {
        return this.lastUpdateConfigTime;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long initialConfigTime, long lastUpdateConfigTime) {
        return new UtilityServiceConfiguration(initialConfigTime, lastUpdateConfigTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) other;
        return this.initialConfigTime == utilityServiceConfiguration.initialConfigTime && this.lastUpdateConfigTime == utilityServiceConfiguration.lastUpdateConfigTime;
    }

    public final long getInitialConfigTime() {
        return this.initialConfigTime;
    }

    public final long getLastUpdateConfigTime() {
        return this.lastUpdateConfigTime;
    }

    public int hashCode() {
        return androidx.collection.b.a(this.lastUpdateConfigTime) + (androidx.collection.b.a(this.initialConfigTime) * 31);
    }

    @NotNull
    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.initialConfigTime + ", lastUpdateConfigTime=" + this.lastUpdateConfigTime + ')';
    }

    public UtilityServiceConfiguration(long j10, long j11) {
        this.initialConfigTime = j10;
        this.lastUpdateConfigTime = j11;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11);
    }
}
