package org.bidon.sdk.config.models;

import com.my.target.common.menu.MenuActionType;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006#"}, d2 = {"Lorg/bidon/sdk/config/models/User;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "platformAdvertisingId", "", "trackingAuthorizationStatus", "applicationId", "appSetId", "appSetIdScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlatformAdvertisingId", "()Ljava/lang/String;", "setPlatformAdvertisingId", "(Ljava/lang/String;)V", "getTrackingAuthorizationStatus", "setTrackingAuthorizationStatus", "getApplicationId", "setApplicationId", "getAppSetId", "setAppSetId", "getAppSetIdScope", "setAppSetIdScope", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class User implements Serializable {

    @JsonName(key = CommonUrlParts.APP_SET_ID)
    @Nullable
    private String appSetId;

    @JsonName(key = CommonUrlParts.APP_SET_ID_SCOPE)
    @Nullable
    private String appSetIdScope;

    @JsonName(key = "idg")
    @Nullable
    private String applicationId;

    @JsonName(key = "idfa")
    @NotNull
    private String platformAdvertisingId;

    @JsonName(key = "tracking_authorization_status")
    @NotNull
    private String trackingAuthorizationStatus;

    public User(@NotNull String platformAdvertisingId, @NotNull String trackingAuthorizationStatus, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(platformAdvertisingId, "platformAdvertisingId");
        Intrinsics.checkNotNullParameter(trackingAuthorizationStatus, "trackingAuthorizationStatus");
        this.platformAdvertisingId = platformAdvertisingId;
        this.trackingAuthorizationStatus = trackingAuthorizationStatus;
        this.applicationId = str;
        this.appSetId = str2;
        this.appSetIdScope = str3;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = user.platformAdvertisingId;
        }
        if ((i10 & 2) != 0) {
            str2 = user.trackingAuthorizationStatus;
        }
        if ((i10 & 4) != 0) {
            str3 = user.applicationId;
        }
        if ((i10 & 8) != 0) {
            str4 = user.appSetId;
        }
        if ((i10 & 16) != 0) {
            str5 = user.appSetIdScope;
        }
        String str6 = str5;
        String str7 = str3;
        return user.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatformAdvertisingId() {
        return this.platformAdvertisingId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackingAuthorizationStatus() {
        return this.trackingAuthorizationStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppSetId() {
        return this.appSetId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @NotNull
    public final User copy(@NotNull String platformAdvertisingId, @NotNull String trackingAuthorizationStatus, @Nullable String applicationId, @Nullable String appSetId, @Nullable String appSetIdScope) {
        Intrinsics.checkNotNullParameter(platformAdvertisingId, "platformAdvertisingId");
        Intrinsics.checkNotNullParameter(trackingAuthorizationStatus, "trackingAuthorizationStatus");
        return new User(platformAdvertisingId, trackingAuthorizationStatus, applicationId, appSetId, appSetIdScope);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.platformAdvertisingId, user.platformAdvertisingId) && Intrinsics.areEqual(this.trackingAuthorizationStatus, user.trackingAuthorizationStatus) && Intrinsics.areEqual(this.applicationId, user.applicationId) && Intrinsics.areEqual(this.appSetId, user.appSetId) && Intrinsics.areEqual(this.appSetIdScope, user.appSetIdScope);
    }

    @Nullable
    public final String getAppSetId() {
        return this.appSetId;
    }

    @Nullable
    public final String getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Nullable
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String getPlatformAdvertisingId() {
        return this.platformAdvertisingId;
    }

    @NotNull
    public final String getTrackingAuthorizationStatus() {
        return this.trackingAuthorizationStatus;
    }

    public int hashCode() {
        int iHashCode = ((this.platformAdvertisingId.hashCode() * 31) + this.trackingAuthorizationStatus.hashCode()) * 31;
        String str = this.applicationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appSetId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appSetIdScope;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAppSetId(@Nullable String str) {
        this.appSetId = str;
    }

    public final void setAppSetIdScope(@Nullable String str) {
        this.appSetIdScope = str;
    }

    public final void setApplicationId(@Nullable String str) {
        this.applicationId = str;
    }

    public final void setPlatformAdvertisingId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platformAdvertisingId = str;
    }

    public final void setTrackingAuthorizationStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trackingAuthorizationStatus = str;
    }

    @NotNull
    public String toString() {
        return "User(platformAdvertisingId=" + this.platformAdvertisingId + ", trackingAuthorizationStatus=" + this.trackingAuthorizationStatus + ", applicationId=" + this.applicationId + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ")";
    }
}
