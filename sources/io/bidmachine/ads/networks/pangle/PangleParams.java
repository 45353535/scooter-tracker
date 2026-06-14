package io.bidmachine.ads.networks.pangle;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class PangleParams extends o {

    @Nullable
    final String bidPayload;

    @Nullable
    final String slotId;

    PangleParams(@NonNull k kVar) {
        super(kVar);
        this.slotId = kVar.l("slot_id");
        this.bidPayload = kVar.l("bid_payload");
    }

    public boolean isValid(@NonNull c cVar) {
        if (TextUtils.isEmpty(this.slotId)) {
            cVar.onAdLoadFailed(ae.a.k("slot_id"));
            return false;
        }
        if (!TextUtils.isEmpty(this.bidPayload)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("bid_payload"));
        return false;
    }
}
