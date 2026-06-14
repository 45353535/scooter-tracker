package com.appodeal.ads.analytics.models;

import androidx.collection.b;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u00064"}, d2 = {"Lcom/appodeal/ads/analytics/models/GeneralParams;", "", EidRequestBuilder.REQUEST_FIELD_IFA, "", JsonStorageKeyNames.SESSION_ID_KEY, "", "sessionUuid", "sessionUptimeMonoMs", "sessionStartTimeMonoMs", "appUptimeMonoMs", "appSessionAverageLengthMs", "packageName", "packageVersion", "versionCode", "", "segmentId", "timestampMs", "<init>", "(Ljava/lang/String;JLjava/lang/String;JJJJLjava/lang/String;Ljava/lang/String;IJJ)V", "getIfa", "()Ljava/lang/String;", "getSessionId", "()J", "getSessionUuid", "getSessionUptimeMonoMs", "getSessionStartTimeMonoMs", "getAppUptimeMonoMs", "getAppSessionAverageLengthMs", "getPackageName", "getPackageVersion", "getVersionCode", "()I", "getSegmentId", "getTimestampMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GeneralParams {
    private final long appSessionAverageLengthMs;
    private final long appUptimeMonoMs;
    private final String ifa;
    private final String packageName;
    private final String packageVersion;
    private final long segmentId;
    private final long sessionId;
    private final long sessionStartTimeMonoMs;
    private final long sessionUptimeMonoMs;
    private final String sessionUuid;
    private final long timestampMs;
    private final int versionCode;

    public GeneralParams(String ifa, long j10, String sessionUuid, long j11, long j12, long j13, long j14, String packageName, String packageVersion, int i10, long j15, long j16) {
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(packageVersion, "packageVersion");
        this.ifa = ifa;
        this.sessionId = j10;
        this.sessionUuid = sessionUuid;
        this.sessionUptimeMonoMs = j11;
        this.sessionStartTimeMonoMs = j12;
        this.appUptimeMonoMs = j13;
        this.appSessionAverageLengthMs = j14;
        this.packageName = packageName;
        this.packageVersion = packageVersion;
        this.versionCode = i10;
        this.segmentId = j15;
        this.timestampMs = j16;
    }

    public static /* synthetic */ GeneralParams copy$default(GeneralParams generalParams, String str, long j10, String str2, long j11, long j12, long j13, long j14, String str3, String str4, int i10, long j15, long j16, int i11, Object obj) {
        long j17;
        long j18;
        String str5 = (i11 & 1) != 0 ? generalParams.ifa : str;
        long j19 = (i11 & 2) != 0 ? generalParams.sessionId : j10;
        String str6 = (i11 & 4) != 0 ? generalParams.sessionUuid : str2;
        long j20 = (i11 & 8) != 0 ? generalParams.sessionUptimeMonoMs : j11;
        long j21 = (i11 & 16) != 0 ? generalParams.sessionStartTimeMonoMs : j12;
        long j22 = (i11 & 32) != 0 ? generalParams.appUptimeMonoMs : j13;
        long j23 = (i11 & 64) != 0 ? generalParams.appSessionAverageLengthMs : j14;
        String str7 = (i11 & 128) != 0 ? generalParams.packageName : str3;
        String str8 = (i11 & 256) != 0 ? generalParams.packageVersion : str4;
        String str9 = str5;
        int i12 = (i11 & 512) != 0 ? generalParams.versionCode : i10;
        long j24 = j19;
        long j25 = (i11 & 1024) != 0 ? generalParams.segmentId : j15;
        if ((i11 & 2048) != 0) {
            j18 = j25;
            j17 = generalParams.timestampMs;
        } else {
            j17 = j16;
            j18 = j25;
        }
        return generalParams.copy(str9, j24, str6, j20, j21, j22, j23, str7, str8, i12, j18, j17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getSegmentId() {
        return this.segmentId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSessionUptimeMonoMs() {
        return this.sessionUptimeMonoMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSessionStartTimeMonoMs() {
        return this.sessionStartTimeMonoMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAppUptimeMonoMs() {
        return this.appUptimeMonoMs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getAppSessionAverageLengthMs() {
        return this.appSessionAverageLengthMs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPackageVersion() {
        return this.packageVersion;
    }

    public final GeneralParams copy(String ifa, long sessionId, String sessionUuid, long sessionUptimeMonoMs, long sessionStartTimeMonoMs, long appUptimeMonoMs, long appSessionAverageLengthMs, String packageName, String packageVersion, int versionCode, long segmentId, long timestampMs) {
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(packageVersion, "packageVersion");
        return new GeneralParams(ifa, sessionId, sessionUuid, sessionUptimeMonoMs, sessionStartTimeMonoMs, appUptimeMonoMs, appSessionAverageLengthMs, packageName, packageVersion, versionCode, segmentId, timestampMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralParams)) {
            return false;
        }
        GeneralParams generalParams = (GeneralParams) other;
        return Intrinsics.areEqual(this.ifa, generalParams.ifa) && this.sessionId == generalParams.sessionId && Intrinsics.areEqual(this.sessionUuid, generalParams.sessionUuid) && this.sessionUptimeMonoMs == generalParams.sessionUptimeMonoMs && this.sessionStartTimeMonoMs == generalParams.sessionStartTimeMonoMs && this.appUptimeMonoMs == generalParams.appUptimeMonoMs && this.appSessionAverageLengthMs == generalParams.appSessionAverageLengthMs && Intrinsics.areEqual(this.packageName, generalParams.packageName) && Intrinsics.areEqual(this.packageVersion, generalParams.packageVersion) && this.versionCode == generalParams.versionCode && this.segmentId == generalParams.segmentId && this.timestampMs == generalParams.timestampMs;
    }

    public final long getAppSessionAverageLengthMs() {
        return this.appSessionAverageLengthMs;
    }

    public final long getAppUptimeMonoMs() {
        return this.appUptimeMonoMs;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPackageVersion() {
        return this.packageVersion;
    }

    public final long getSegmentId() {
        return this.segmentId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getSessionStartTimeMonoMs() {
        return this.sessionStartTimeMonoMs;
    }

    public final long getSessionUptimeMonoMs() {
        return this.sessionUptimeMonoMs;
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return b.a(this.timestampMs) + ((b.a(this.segmentId) + ((this.versionCode + ((this.packageVersion.hashCode() + ((this.packageName.hashCode() + ((b.a(this.appSessionAverageLengthMs) + ((b.a(this.appUptimeMonoMs) + ((b.a(this.sessionStartTimeMonoMs) + ((b.a(this.sessionUptimeMonoMs) + ((this.sessionUuid.hashCode() + ((b.a(this.sessionId) + (this.ifa.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "GeneralParams(ifa=" + this.ifa + ", sessionId=" + this.sessionId + ", sessionUuid=" + this.sessionUuid + ", sessionUptimeMonoMs=" + this.sessionUptimeMonoMs + ", sessionStartTimeMonoMs=" + this.sessionStartTimeMonoMs + ", appUptimeMonoMs=" + this.appUptimeMonoMs + ", appSessionAverageLengthMs=" + this.appSessionAverageLengthMs + ", packageName=" + this.packageName + ", packageVersion=" + this.packageVersion + ", versionCode=" + this.versionCode + ", segmentId=" + this.segmentId + ", timestampMs=" + this.timestampMs + ")";
    }

    public /* synthetic */ GeneralParams(String str, long j10, String str2, long j11, long j12, long j13, long j14, String str3, String str4, int i10, long j15, long j16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, j11, j12, j13, j14, str3, str4, i10, j15, (i11 & 2048) != 0 ? System.currentTimeMillis() : j16);
    }
}
