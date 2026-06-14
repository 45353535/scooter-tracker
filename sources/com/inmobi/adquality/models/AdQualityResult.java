package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/inmobi/adquality/models/AdQualityResult;", "", "imageLocation", "", "sdkModelResult", "beaconUrl", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageLocation", "()Ljava/lang/String;", "setImageLocation", "(Ljava/lang/String;)V", "getSdkModelResult", "setSdkModelResult", "getBeaconUrl", "getExtras", "setExtras", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdQualityResult {

    @NotNull
    private final String beaconUrl;

    @Nullable
    private String extras;

    @NotNull
    private String imageLocation;

    @Nullable
    private String sdkModelResult;

    public AdQualityResult(@NotNull String imageLocation, @Nullable String str, @NotNull String beaconUrl, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final AdQualityResult copy(@NotNull String imageLocation, @Nullable String sdkModelResult, @NotNull String beaconUrl, @Nullable String extras) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, sdkModelResult, beaconUrl, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) other;
        return Intrinsics.areEqual(this.imageLocation, adQualityResult.imageLocation) && Intrinsics.areEqual(this.sdkModelResult, adQualityResult.sdkModelResult) && Intrinsics.areEqual(this.beaconUrl, adQualityResult.beaconUrl) && Intrinsics.areEqual(this.extras, adQualityResult.extras);
    }

    @NotNull
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iHashCode2 = (this.beaconUrl.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.extras;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setImageLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(@Nullable String str) {
        this.sdkModelResult = str;
    }

    @NotNull
    public String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
