package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "privacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "isTestMode", "", "bidFloor", "", "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)V", "getBidFloor", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "getPrivacyPreferences", "()Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "component1", "component2", "component3", MenuActionType.COPY, "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "equals", "other", "", "hashCode", "", "toString", "", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MobileFuseBiddingTokenRequest implements IMobileFuseBiddingTokenRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float bidFloor;
    private final boolean isTestMode;

    @NotNull
    private final MobileFusePrivacyPreferences privacyPreferences;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest$Companion;", "", "()V", "forPartner", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return MobileFuseBiddingTokenRequest_forPartnerKt.createBiddingTokenRequest(partner);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MobileFuseBiddingTokenRequest(@NotNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10) {
        this(mobileFusePrivacyPreferences, z10, null, 4, null);
    }

    public static /* synthetic */ MobileFuseBiddingTokenRequest copy$default(MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mobileFusePrivacyPreferences = mobileFuseBiddingTokenRequest.getPrivacyPreferences();
        }
        if ((i10 & 2) != 0) {
            z10 = mobileFuseBiddingTokenRequest.getIsTestMode();
        }
        if ((i10 & 4) != 0) {
            f10 = mobileFuseBiddingTokenRequest.getBidFloor();
        }
        return mobileFuseBiddingTokenRequest.copy(mobileFusePrivacyPreferences, z10, f10);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
        return INSTANCE.forPartner(partner);
    }

    @NotNull
    public final MobileFusePrivacyPreferences component1() {
        return getPrivacyPreferences();
    }

    public final boolean component2() {
        return getIsTestMode();
    }

    @Nullable
    public final Float component3() {
        return getBidFloor();
    }

    @NotNull
    public final MobileFuseBiddingTokenRequest copy(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean isTestMode, @Nullable Float bidFloor) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        return new MobileFuseBiddingTokenRequest(privacyPreferences, isTestMode, bidFloor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileFuseBiddingTokenRequest)) {
            return false;
        }
        MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest = (MobileFuseBiddingTokenRequest) other;
        return Intrinsics.areEqual(getPrivacyPreferences(), mobileFuseBiddingTokenRequest.getPrivacyPreferences()) && getIsTestMode() == mobileFuseBiddingTokenRequest.getIsTestMode() && Intrinsics.areEqual((Object) getBidFloor(), (Object) mobileFuseBiddingTokenRequest.getBidFloor());
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @Nullable
    public Float getBidFloor() {
        return this.bidFloor;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @NotNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        MobileFusePrivacyPreferences privacyPreferences = getPrivacyPreferences();
        int iHashCode = (privacyPreferences != null ? privacyPreferences.hashCode() : 0) * 31;
        boolean isTestMode = getIsTestMode();
        ?? r22 = isTestMode;
        if (isTestMode) {
            r22 = 1;
        }
        int i10 = (iHashCode + r22) * 31;
        Float bidFloor = getBidFloor();
        return i10 + (bidFloor != null ? bidFloor.hashCode() : 0);
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    /* JADX INFO: renamed from: isTestMode, reason: from getter */
    public boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "MobileFuseBiddingTokenRequest(privacyPreferences=" + getPrivacyPreferences() + ", isTestMode=" + getIsTestMode() + ", bidFloor=" + getBidFloor() + ")";
    }

    public MobileFuseBiddingTokenRequest(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z10, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        this.privacyPreferences = privacyPreferences;
        this.isTestMode = z10;
        this.bidFloor = f10;
    }

    public /* synthetic */ MobileFuseBiddingTokenRequest(MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z10, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobileFusePrivacyPreferences, z10, (i10 & 4) != 0 ? null : f10);
    }
}
