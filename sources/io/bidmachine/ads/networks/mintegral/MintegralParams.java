package io.bidmachine.ads.networks.mintegral;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import net.pubnative.lite.sdk.analytics.Reporting;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class MintegralParams extends o {

    @Nullable
    final String adUnitId;

    @Nullable
    final String bidToken;

    @Nullable
    final String placementId;

    MintegralParams(@NonNull k kVar) {
        super(kVar);
        this.adUnitId = kVar.l("ad_unit_id");
        this.bidToken = kVar.l("bid_token");
        this.placementId = kVar.l(Reporting.Key.PLACEMENT_ID);
    }

    public boolean isValid(@NonNull c cVar) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            cVar.onAdLoadFailed(ae.a.k("ad_unit_id"));
            return false;
        }
        if (!TextUtils.isEmpty(this.bidToken)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("bid_token"));
        return false;
    }
}
