package io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceParams extends o {

    @Nullable
    final String bidPayload;

    @Nullable
    final String placementId;

    MetaAudienceParams(@NonNull k kVar) {
        super(kVar);
        this.placementId = kVar.l("meta_key");
        this.bidPayload = kVar.l("bid_payload");
    }

    public boolean isValid(@NonNull c cVar) {
        if (TextUtils.isEmpty(this.placementId)) {
            cVar.onAdLoadFailed(ae.a.k("meta_key"));
            return false;
        }
        if (!TextUtils.isEmpty(this.bidPayload)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("bid_payload"));
        return false;
    }
}
