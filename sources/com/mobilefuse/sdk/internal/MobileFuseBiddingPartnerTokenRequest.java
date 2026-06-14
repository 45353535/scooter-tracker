package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "privacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "isTestMode", "", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "bidFloor", "", "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLcom/mobilefuse/sdk/internal/bidding/Partner;Ljava/lang/Float;)V", "getBidFloor", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "getPartner", "()Lcom/mobilefuse/sdk/internal/bidding/Partner;", "getPrivacyPreferences", "()Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "component1", "component2", "component3", "component4", MenuActionType.COPY, "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLcom/mobilefuse/sdk/internal/bidding/Partner;Ljava/lang/Float;)Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "equals", "other", "", "hashCode", "", "toString", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MobileFuseBiddingPartnerTokenRequest implements IMobileFuseBiddingTokenRequest {

    @Nullable
    private final Float bidFloor;
    private final boolean isTestMode;

    @NotNull
    private final Partner partner;

    @NotNull
    private final MobileFusePrivacyPreferences privacyPreferences;

    public MobileFuseBiddingPartnerTokenRequest(@NotNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10, @NotNull Partner partner) {
        this(mobileFusePrivacyPreferences, z10, partner, null, 8, null);
    }

    public static /* synthetic */ MobileFuseBiddingPartnerTokenRequest copy$default(MobileFuseBiddingPartnerTokenRequest mobileFuseBiddingPartnerTokenRequest, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10, Partner partner, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mobileFusePrivacyPreferences = mobileFuseBiddingPartnerTokenRequest.getPrivacyPreferences();
        }
        if ((i10 & 2) != 0) {
            z10 = mobileFuseBiddingPartnerTokenRequest.getIsTestMode();
        }
        if ((i10 & 4) != 0) {
            partner = mobileFuseBiddingPartnerTokenRequest.partner;
        }
        if ((i10 & 8) != 0) {
            f10 = mobileFuseBiddingPartnerTokenRequest.getBidFloor();
        }
        return mobileFuseBiddingPartnerTokenRequest.copy(mobileFusePrivacyPreferences, z10, partner, f10);
    }

    @NotNull
    public final MobileFusePrivacyPreferences component1() {
        return getPrivacyPreferences();
    }

    public final boolean component2() {
        return getIsTestMode();
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Partner getPartner() {
        return this.partner;
    }

    @Nullable
    public final Float component4() {
        return getBidFloor();
    }

    @NotNull
    public final MobileFuseBiddingPartnerTokenRequest copy(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean isTestMode, @NotNull Partner partner, @Nullable Float bidFloor) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        Intrinsics.checkNotNullParameter(partner, "partner");
        return new MobileFuseBiddingPartnerTokenRequest(privacyPreferences, isTestMode, partner, bidFloor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileFuseBiddingPartnerTokenRequest)) {
            return false;
        }
        MobileFuseBiddingPartnerTokenRequest mobileFuseBiddingPartnerTokenRequest = (MobileFuseBiddingPartnerTokenRequest) other;
        return Intrinsics.areEqual(getPrivacyPreferences(), mobileFuseBiddingPartnerTokenRequest.getPrivacyPreferences()) && getIsTestMode() == mobileFuseBiddingPartnerTokenRequest.getIsTestMode() && Intrinsics.areEqual(this.partner, mobileFuseBiddingPartnerTokenRequest.partner) && Intrinsics.areEqual((Object) getBidFloor(), (Object) mobileFuseBiddingPartnerTokenRequest.getBidFloor());
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @Nullable
    public Float getBidFloor() {
        return this.bidFloor;
    }

    @NotNull
    public final Partner getPartner() {
        return this.partner;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @NotNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        MobileFusePrivacyPreferences privacyPreferences = getPrivacyPreferences();
        int iHashCode = (privacyPreferences != null ? privacyPreferences.hashCode() : 0) * 31;
        boolean isTestMode = getIsTestMode();
        ?? r22 = isTestMode;
        if (isTestMode) {
            r22 = 1;
        }
        int i10 = (iHashCode + r22) * 31;
        Partner partner = this.partner;
        int iHashCode2 = (i10 + (partner != null ? partner.hashCode() : 0)) * 31;
        Float bidFloor = getBidFloor();
        return iHashCode2 + (bidFloor != null ? bidFloor.hashCode() : 0);
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    /* JADX INFO: renamed from: isTestMode, reason: from getter */
    public boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "MobileFuseBiddingPartnerTokenRequest(privacyPreferences=" + getPrivacyPreferences() + ", isTestMode=" + getIsTestMode() + ", partner=" + this.partner + ", bidFloor=" + getBidFloor() + ")";
    }

    public MobileFuseBiddingPartnerTokenRequest(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z10, @NotNull Partner partner, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        Intrinsics.checkNotNullParameter(partner, "partner");
        this.privacyPreferences = privacyPreferences;
        this.isTestMode = z10;
        this.partner = partner;
        this.bidFloor = f10;
    }

    public /* synthetic */ MobileFuseBiddingPartnerTokenRequest(MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10, Partner partner, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobileFusePrivacyPreferences, z10, partner, (i10 & 8) != 0 ? null : f10);
    }
}
