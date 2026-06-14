package io.bidmachine.ads.networks.my_target;

import ae.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class MyTargetParams extends o {

    @Nullable
    final String bidId;

    @Nullable
    final Integer slotId;

    MyTargetParams(@NonNull k kVar) {
        super(kVar);
        this.slotId = kVar.n("slot_id");
        this.bidId = kVar.l("bid_id");
    }

    public boolean isValid(@NonNull c cVar) {
        if (this.slotId == null) {
            cVar.onAdLoadFailed(a.k("slot_id"));
            return false;
        }
        String str = this.bidId;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        cVar.onAdLoadFailed(a.k("bid_id"));
        return false;
    }
}
