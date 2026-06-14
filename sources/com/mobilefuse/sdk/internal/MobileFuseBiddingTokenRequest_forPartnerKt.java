package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createBiddingTokenRequest", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MobileFuseBiddingTokenRequest_forPartnerKt {
    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest createBiddingTokenRequest(@NotNull Partner partner) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        return new MobileFuseBiddingPartnerTokenRequest(new MobileFusePrivacyPreferences.Builder().build(), false, partner, null, 8, null);
    }
}
