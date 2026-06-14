package com.mobilefuse.sdk.telemetry.metricslogging;

import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "", "adInstanceId", "", "adType", "", "placementId", C4240b4.i.O, "renderType", "videoStreamEnabled", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdInstanceId", "()I", "getAdSize", "()Ljava/lang/String;", "getAdType", "getPlacementId", "getRenderType", "getVideoStreamEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "equals", "other", "hashCode", "toString", y.f66058y, "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TelemetryAdInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int adInstanceId;

    @Nullable
    private final String adSize;

    @NotNull
    private final String adType;

    @Nullable
    private final String placementId;

    @NotNull
    private final String renderType;

    @Nullable
    private final Boolean videoStreamEnabled;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo$Companion;", "", "()V", "createVastInstance", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "id", "", "streamEnabled", "", "(ILjava/lang/Boolean;)Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final TelemetryAdInfo createVastInstance(int id2, @Nullable Boolean streamEnabled) {
            return new TelemetryAdInfo(id2, null, null, null, "VAST", streamEnabled, 14, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TelemetryAdInfo(int i10) {
        this(i10, null, null, null, null, null, 62, null);
    }

    public static /* synthetic */ TelemetryAdInfo copy$default(TelemetryAdInfo telemetryAdInfo, int i10, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = telemetryAdInfo.adInstanceId;
        }
        if ((i11 & 2) != 0) {
            str = telemetryAdInfo.adType;
        }
        if ((i11 & 4) != 0) {
            str2 = telemetryAdInfo.placementId;
        }
        if ((i11 & 8) != 0) {
            str3 = telemetryAdInfo.adSize;
        }
        if ((i11 & 16) != 0) {
            str4 = telemetryAdInfo.renderType;
        }
        if ((i11 & 32) != 0) {
            bool = telemetryAdInfo.videoStreamEnabled;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        return telemetryAdInfo.copy(i10, str, str2, str3, str5, bool2);
    }

    @NotNull
    public static final TelemetryAdInfo createVastInstance(int i10, @Nullable Boolean bool) {
        return INSTANCE.createVastInstance(i10, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdSize() {
        return this.adSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRenderType() {
        return this.renderType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getVideoStreamEnabled() {
        return this.videoStreamEnabled;
    }

    @NotNull
    public final TelemetryAdInfo copy(int adInstanceId, @NotNull String adType, @Nullable String placementId, @Nullable String adSize, @NotNull String renderType, @Nullable Boolean videoStreamEnabled) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(renderType, "renderType");
        return new TelemetryAdInfo(adInstanceId, adType, placementId, adSize, renderType, videoStreamEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryAdInfo)) {
            return false;
        }
        TelemetryAdInfo telemetryAdInfo = (TelemetryAdInfo) other;
        return this.adInstanceId == telemetryAdInfo.adInstanceId && Intrinsics.areEqual(this.adType, telemetryAdInfo.adType) && Intrinsics.areEqual(this.placementId, telemetryAdInfo.placementId) && Intrinsics.areEqual(this.adSize, telemetryAdInfo.adSize) && Intrinsics.areEqual(this.renderType, telemetryAdInfo.renderType) && Intrinsics.areEqual(this.videoStreamEnabled, telemetryAdInfo.videoStreamEnabled);
    }

    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @Nullable
    public final String getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final String getRenderType() {
        return this.renderType;
    }

    @Nullable
    public final Boolean getVideoStreamEnabled() {
        return this.videoStreamEnabled;
    }

    public int hashCode() {
        int i10 = this.adInstanceId * 31;
        String str = this.adType;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.placementId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.adSize;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.renderType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.videoStreamEnabled;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TelemetryAdInfo(adInstanceId=" + this.adInstanceId + ", adType=" + this.adType + ", placementId=" + this.placementId + ", adSize=" + this.adSize + ", renderType=" + this.renderType + ", videoStreamEnabled=" + this.videoStreamEnabled + ")";
    }

    public TelemetryAdInfo(int i10, @NotNull String str) {
        this(i10, str, null, null, null, null, 60, null);
    }

    public TelemetryAdInfo(int i10, @NotNull String str, @Nullable String str2) {
        this(i10, str, str2, null, null, null, 56, null);
    }

    public TelemetryAdInfo(int i10, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        this(i10, str, str2, str3, null, null, 48, null);
    }

    public TelemetryAdInfo(int i10, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this(i10, str, str2, str3, str4, null, 32, null);
    }

    public TelemetryAdInfo(int i10, @NotNull String adType, @Nullable String str, @Nullable String str2, @NotNull String renderType, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(renderType, "renderType");
        this.adInstanceId = i10;
        this.adType = adType;
        this.placementId = str;
        this.adSize = str2;
        this.renderType = renderType;
        this.videoStreamEnabled = bool;
    }

    public /* synthetic */ TelemetryAdInfo(int i10, String str, String str2, String str3, String str4, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? null : bool);
    }
}
