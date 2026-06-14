package com.appsflyer.internal.models;

import androidx.autofill.HintConstants;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "familyName", "givenName", "profileId", "profileName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmailAddress", "()Ljava/lang/String;", "getFamilyName", "getGivenName", "getProfileId", "getProfileName", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SubscribeWithGoogleInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String emailAddress;

    @NotNull
    private final String familyName;

    @NotNull
    private final String givenName;

    @NotNull
    private final String profileId;

    @NotNull
    private final String profileName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SubscribeWithGoogleInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public SubscribeWithGoogleInfo fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(\"emailAddress\")");
            String strOptString2 = json.optString("familyName");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(\"familyName\")");
            String strOptString3 = json.optString("givenName");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(\"givenName\")");
            String strOptString4 = json.optString("profileId");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(\"profileId\")");
            String strOptString5 = json.optString("profileName");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(\"profileName\")");
            return new SubscribeWithGoogleInfo(strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
        }
    }

    public SubscribeWithGoogleInfo(@NotNull String emailAddress, @NotNull String familyName, @NotNull String givenName, @NotNull String profileId, @NotNull String profileName) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        this.emailAddress = emailAddress;
        this.familyName = familyName;
        this.givenName = givenName;
        this.profileId = profileId;
        this.profileName = profileName;
    }

    public static /* synthetic */ SubscribeWithGoogleInfo copy$default(SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscribeWithGoogleInfo.emailAddress;
        }
        if ((i10 & 2) != 0) {
            str2 = subscribeWithGoogleInfo.familyName;
        }
        if ((i10 & 4) != 0) {
            str3 = subscribeWithGoogleInfo.givenName;
        }
        if ((i10 & 8) != 0) {
            str4 = subscribeWithGoogleInfo.profileId;
        }
        if ((i10 & 16) != 0) {
            str5 = subscribeWithGoogleInfo.profileName;
        }
        String str6 = str5;
        String str7 = str3;
        return subscribeWithGoogleInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProfileName() {
        return this.profileName;
    }

    @NotNull
    public final SubscribeWithGoogleInfo copy(@NotNull String emailAddress, @NotNull String familyName, @NotNull String givenName, @NotNull String profileId, @NotNull String profileName) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        return new SubscribeWithGoogleInfo(emailAddress, familyName, givenName, profileId, profileName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeWithGoogleInfo)) {
            return false;
        }
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) other;
        return Intrinsics.areEqual(this.emailAddress, subscribeWithGoogleInfo.emailAddress) && Intrinsics.areEqual(this.familyName, subscribeWithGoogleInfo.familyName) && Intrinsics.areEqual(this.givenName, subscribeWithGoogleInfo.givenName) && Intrinsics.areEqual(this.profileId, subscribeWithGoogleInfo.profileId) && Intrinsics.areEqual(this.profileName, subscribeWithGoogleInfo.profileName);
    }

    @NotNull
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @NotNull
    public final String getFamilyName() {
        return this.familyName;
    }

    @NotNull
    public final String getGivenName() {
        return this.givenName;
    }

    @NotNull
    public final String getProfileId() {
        return this.profileId;
    }

    @NotNull
    public final String getProfileName() {
        return this.profileName;
    }

    public int hashCode() {
        return (((((((this.emailAddress.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.profileId.hashCode()) * 31) + this.profileName.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubscribeWithGoogleInfo(emailAddress=" + this.emailAddress + ", familyName=" + this.familyName + ", givenName=" + this.givenName + ", profileId=" + this.profileId + ", profileName=" + this.profileName + ")";
    }
}
