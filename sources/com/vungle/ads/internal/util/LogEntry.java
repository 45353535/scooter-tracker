package com.vungle.ads.internal.util;

import com.amazon.device.ads.DtbConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u000e\u0010$\u001a\u00020%*\u0004\u0018\u00010\u0004H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/util/LogEntry;", "", "()V", "adSource", "", "getAdSource$vungle_ads_release", "()Ljava/lang/String;", "setAdSource$vungle_ads_release", "(Ljava/lang/String;)V", "adoEnabled", "", "getAdoEnabled$vungle_ads_release", "()Ljava/lang/Boolean;", "setAdoEnabled$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "creativeId", "getCreativeId$vungle_ads_release", "setCreativeId$vungle_ads_release", "eventId", "getEventId$vungle_ads_release", "setEventId$vungle_ads_release", DtbConstants.MEDIATION_NAME, "getMediationName$vungle_ads_release", "setMediationName$vungle_ads_release", "partialDownloadEnabled", "getPartialDownloadEnabled$vungle_ads_release", "setPartialDownloadEnabled$vungle_ads_release", "placementRefId", "getPlacementRefId$vungle_ads_release", "setPlacementRefId$vungle_ads_release", "vmVersion", "getVmVersion$vungle_ads_release", "setVmVersion$vungle_ads_release", "equals", "other", "hashCode", "", "toString", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogEntry {

    @Nullable
    private String adSource;

    @Nullable
    private Boolean adoEnabled;

    @Nullable
    private String creativeId;

    @Nullable
    private String eventId;

    @Nullable
    private String mediationName;

    @Nullable
    private Boolean partialDownloadEnabled;

    @Nullable
    private String placementRefId;

    @Nullable
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(LogEntry.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        LogEntry logEntry = (LogEntry) other;
        return Intrinsics.areEqual(this.placementRefId, logEntry.placementRefId) && Intrinsics.areEqual(this.creativeId, logEntry.creativeId) && Intrinsics.areEqual(this.eventId, logEntry.eventId) && Intrinsics.areEqual(this.adSource, logEntry.adSource) && Intrinsics.areEqual(this.mediationName, logEntry.mediationName) && Intrinsics.areEqual(this.vmVersion, logEntry.vmVersion) && Intrinsics.areEqual(this.partialDownloadEnabled, logEntry.partialDownloadEnabled) && Intrinsics.areEqual(this.adoEnabled, logEntry.adoEnabled);
    }

    @Nullable
    /* JADX INFO: renamed from: getAdSource$vungle_ads_release, reason: from getter */
    public final String getAdSource() {
        return this.adSource;
    }

    @Nullable
    /* JADX INFO: renamed from: getAdoEnabled$vungle_ads_release, reason: from getter */
    public final Boolean getAdoEnabled() {
        return this.adoEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: getCreativeId$vungle_ads_release, reason: from getter */
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    /* JADX INFO: renamed from: getEventId$vungle_ads_release, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: getMediationName$vungle_ads_release, reason: from getter */
    public final String getMediationName() {
        return this.mediationName;
    }

    @Nullable
    /* JADX INFO: renamed from: getPartialDownloadEnabled$vungle_ads_release, reason: from getter */
    public final Boolean getPartialDownloadEnabled() {
        return this.partialDownloadEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlacementRefId$vungle_ads_release, reason: from getter */
    public final String getPlacementRefId() {
        return this.placementRefId;
    }

    @Nullable
    /* JADX INFO: renamed from: getVmVersion$vungle_ads_release, reason: from getter */
    public final String getVmVersion() {
        return this.vmVersion;
    }

    public final void setAdSource$vungle_ads_release(@Nullable String str) {
        this.adSource = str;
    }

    public final void setAdoEnabled$vungle_ads_release(@Nullable Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(@Nullable String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(@Nullable String str) {
        this.eventId = str;
    }

    public final void setMediationName$vungle_ads_release(@Nullable String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(@Nullable Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(@Nullable String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(@Nullable String str) {
        this.vmVersion = str;
    }

    @NotNull
    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
